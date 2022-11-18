### https://developer.android.com/codelabs/basic-android-kotlin-compose-test-viewmodel

This codelab teaches you to write unit tests to test the ViewModel component. You will add unit tests for the Unscramble game app. The [Unscramble](https://github.com/google-developer-training/android-basics-kotlin-unscramble-app) app is a fun word game where users have to guess a scrambled word and earn points for guessing correctly. The following image shows a preview of the app:

<div align="center">
  <img src="https://user-images.githubusercontent.com/94898232/202433056-103937e9-b062-4db4-a199-bb81c56c3e63.gif" width="330" height="668"/>
</div>

In the [Write automated tests](https://developer.android.com/codelabs/basic-android-kotlin-compose-write-automated-tests?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-write-automated-tests#0) codelab, you learned what automated tests are and why they are important. You also learned how to implement unit tests.

You learned:

* Automated testing is code that verifies the accuracy of another piece of code.
* Testing is an important part of the app development process. By running tests against your app consistently, you can verify your app's functional behavior and usability before you release it publicly.
* With unit tests, you can test functions, classes, and properties.
* Local unit tests are executed on your workstation, which means they run in a development environment without the need for an Android device or emulator. In other words, local tests run on your computer.

Before you proceed, make sure that you complete the Write automated tests and ViewModel and State in Compose codelabs.

## Prerequisites
* Knowledge of Kotlin, including functions, lambdas, and stateless composables
* Basic knowledge of how to build layouts in Jetpack Compose
* Basic knowledge of Material Design
* Basic knowledge of how to implement ViewModel
## What you'll learn
* How to add dependencies for unit tests in the app module's build.gradle file
* How to create a test strategy to implement unit tests
* How to write unit tests using JUnit4 and understand the test instance lifecycle
* How to run, analyze, and improve code coverage
## What you'll build
* Unit tests for the Unscramble game app

*** 

Unscramble app
=================================

Single player game app that displays scrambled words. To play the game, player has to make a
word using all the letters in the displayed scrambled word.
This code demonstrates the Android Architecture component- ViewModel and StateFlow.


Pre-requisites
--------------
* Experience with Kotlin syntax.
* How to create and run a project in Android Studio.
* How to create composable functions 


Getting Started
---------------
1. Install Android Studio, if you don't already have it.
2. Download the sample.
3. Import the sample into Android Studio.
4. Build and run the sample.

