#!/bin/bash

#java -cp "/usr/share/java/postgresql/postgresql-42.1.4.jar:" Main

#javac ./src/*/*.java -d ./bin
#java -cp ./bin main.Main

javac Main.java
java -cp "/usr/share/java/postgresql/*:" Main
