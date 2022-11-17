### https://developer.android.com/codelabs/android-training-unit-tests

## Introduction
Testing your code can help you catch bugs early in development, when bugs are the least expensive to address. As your app gets larger and more complex, testing improves your code's robustness. With tests in your code, you can exercise small portions of your app in isolation, and you can test in ways that are automatable and repeatable.

Android Studio and the Android Testing Support Library support several different kinds of tests and testing frameworks. In this practical you explore Android Studio's built-in testing functionality, and you learn how to write and run local unit tests.

Local unit tests are tests that are compiled and run entirely on your local machine with the Java Virtual Machine (JVM). You use local unit tests to test the parts of your app that don't need access to the Android framework or an Android-powered device or emulator, for example the internal logic. You also use local unit tests to test parts of your app for which you can create fake ("mock" or stub) objects that pretend to behave like the framework equivalents.

Unit tests are written with JUnit, a common unit testing framework for Java.

## What you'll learn
* How to organize and run tests in Android Studio.
* Understand what a unit test is.
* Write unit tests for your code.
## What you'll do
* Run the initial tests in the SimpleCalc app.
* Add more tests to the SimpleCalc app.
* Run the unit tests to see the results.
