Administration Manual
====================

Instructions
------------

This manual is intended to give a quick overview of how to download and run the application tic-tac-toe. All instructions are aimed towards linux users and we recommend using Firefox to use the application (when it has been run).

Java JDK 
---------

To be able to run the application locally you will need the java-jdk. Java-jdk is used to compile the java files into an executable.

* Instructions for Linux:
```
sudo apt-get update && sudo apt-get install default-jdk
```

GitHub
-------

To download the application one has to have git installed. Git can be accuired for a linux machine with the command ```sudo apt-get install git```, although a lot of linux distributions have it pre-installed. Next you need to clone the repository into a directory of your choise.

Navigate to the directory you wish to save the program to and run the following command:
```
sudo git clone https://github.com/Stodid/late-term-assignment.git
```

Once this has been done a folder called "late-term-assignment" should have been created which has the application inside.

Gradle
--------

Make sure you have navigated into the directory that was created by git. Once inside the "late-term-assignment" directory, the only thing you need to do is run the command ```./gradlew run```. You should see the words "Spark has ignited ...", this means the server has successfully started. Now you can open the application by opening the url localhost:4567 in your favourite browser (firefox is strongly recommended). 

You need not install gradle to be able to run the application. By using the ```./gradlew``` command you can use gradle without having to install it.

Heroku
--------

Heroku is used to run the app externally. By navigating to https://latetermoo.herokuapp.com/ you should see the app up and running. Unless you are part of the development team you will not be able to affect the app in that location.
