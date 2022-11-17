### https://developer.android.com/codelabs/kotlin-coroutines

In this codelab you'll learn how to use Kotlin Coroutines in an Android app—the recommended way of managing background threads that can simplify code by reducing the need for callbacks.

Coroutines are a Kotlin feature that converts async callbacks for long-running tasks, such as database or network access, into sequential code.

Here is a code snippet to give you an idea of what you'll be doing:


    // Async callbacks
    networkRequest { result ->
      // Successful network request
      databaseSave(result) { rows ->
        // Result saved
      }
    }
    
    
The callback-based code will be converted to sequential code using coroutines:


    // The same code with coroutines
    val result = networkRequest()
    // Successful network request
    databaseSave(result)
    // Result saved
You will start with an existing app, built using Architecture Components, that uses a callback style for long-running tasks.

By the end of this codelab, you'll have enough experience to use coroutines in your app to load data from the network, and you will be able to integrate coroutines into an app. You'll also be familiar with best practices for coroutines, and how to write a test against code that uses coroutines.

## Prerequisites
* Familiarity with the Architecture Components ViewModel, LiveData, Repository, and Room.
* Experience with Kotlin syntax, including extension functions and lambdas.
* A basic understanding of using threads on Android, including the main thread, background threads, and callbacks.

## What you'll do
* Call code written with coroutines and obtain results.
* Use suspend functions to make async code sequential.
* Use launch and runBlocking to control how code executes.
* Learn techniques to convert existing APIs to coroutines using suspendCoroutine.
* Use coroutines with Architecture Components.
* Learn best practices for testing coroutines.
