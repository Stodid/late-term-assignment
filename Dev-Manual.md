Development Manual
====================

Instructions
------------

To set up the repository for active development a few steps need to be taken first. Note that *nix systems were exclusively used in building the applications and this manual reflects that. Also firefox is strongly recommended when running the app, and required for selenium tests. If properly set up and the with the right tools installed, the development process should be fully automated.

Forking the repository is not expected to work correctly at this time.

Java JDK
---------

To be able to run the application locally you will need the java-jdk. 

* Instructions for Linux:
```
sudo apt-get update && sudo apt-get install default-jdk
```
    

GitHub
-------

The next step is cloning the app's repository on GitHub. To do so, enter the following command:
```
sudo git clone https://github.com/Stodid/late-term-assignment.git
```

Ofcourse, to do so you must also have git installed which can be done with this command:
```
sudo apt-get install git
```

To install and run on a fresh Ubuntu 14.04 machine
------------------------------------

For installing on a fresh machine all you have to do is make sure you have java-jdk installed, cloning the github repository and firing it up with gradle.
```
sudo apt-get update && sudo apt-get install default-jdk
sudo git clone https://github.com/Stodid/late-term-assignment.git
./gradlew run
```

Gradle
--------

It is not required to install gradle to be able to use the development environment. The gradle wrapper will suffice, however it is recommended to go ahead and install it if one plans to use gradle a lot.

Gradle is used to keep track of all required dependencies and sets up tasks for building the application. Gradle is the cornerstone of the application build process, but thanks to the gradle wrapper all gradle tasks can be run without installing any third-party applications.

* Instructions for Linux:
```
add-apt-repository ppa:cwchien/gradle
apt-get update
apt-get install gradle
```

* Instructions for Mac using Homebrew:
```
brew install gradle
```

Heroku
--------

Heroku is used to deploy for production. Travis will automatically deploy to heroku provided that all tests are passed.

Heroku toolbelt is not required either, but it is very helpful for interacting with Heroku as a staging or production server.

* Install Heroku Toolbelt for Linux:
```
wget -qO- https://toolbelt.heroku.com/install-ubuntu.sh | sh
```

Automated builds and deployment
----------------------

Provided that you have access to the github repository every push to master will also stage a build to travis CI. Travis will check all unit tests followed by end-to-end tests using seleanium. If all these tests pass travis will deploy to a heroku production server.

If all goes well the app is up and running on https://latetermoo.herokuapp.com which will update each time a new commit is pushed to github.

Selenium
----------

Selenium will run end-to-end tests on the code, assuring that the web application behaves as expected. To do selenium tests locally the command ```.gradlew selenium``` can be run. Travis will automatically do selenium tests after a commit to GitHub.

Firefox is required (version 28.0 recommended) to run selenium tests locally. If development takes place in a GUI-less environmen xvfb must also be installed.

* Installing xvfb
```
sudo apt-get install -y xvfb
sudo apt-get install -y xfonts-100dpi xfonts-75dpi xfonts-scalable xfonts-cyrillic
sudo apt-get install -y firefox=28.0+build2-0ubuntu2
```
