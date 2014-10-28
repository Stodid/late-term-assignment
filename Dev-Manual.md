Dependencies:
====================

jre 

Gradle
--------

* Instructions for Linux:
    add-apt-repository ppa:cwchien/gradle
    apt-get update
    apt-get install gradle

* Instructions for Mac using Homebrew:
    brew install gradle


Heroku
--------

* Install Heroku Toolbelt for Linux:
    wget -qO- https://toolbelt.heroku.com/install-ubuntu.sh | sh

To install and run on a fresh Ubuntu 14.04 machine
------------------------------------
sudo apt-get update && sudo apt-get install default-jdk
./gradlew build
./run.sh
