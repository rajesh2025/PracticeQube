package coroutines

import kotlinx.coroutines.*

val scopeCor = CoroutineScope(Dispatchers.Default)
suspend fun main() {

//    val job = scopeCor.launch {
//        println("scope context $coroutineContext") // ✅ Will now print
//        longRunning1()
//        withContext(Dispatchers.Unconfined) {
//            longRunning2()
//        }
//    }
//    job.join() // ✅ Ensures coroutine completes before mai


    val job = scopeCor.launch {
        println("scope context $coroutineContext")

        launch { longRunning1() } // ✅ Runs concurrently
        launch { longRunning2() } // ✅ Runs concurrently
    }
    job.join() // ✅ E
}

suspend fun completedDeffered() {
    val scopeCor = CoroutineScope(Dispatchers.Default)
    val completion = CompletableDeferred<Unit>()

    scopeCor.launch {
        println("scope context $coroutineContext")
        longRunning1()
        completion.complete(Unit) // ✅ Marks completion
    }

    completion.join() // ✅ Blocks until coroutin
}


suspend fun longRunning1() {
    delay(5000)
    println("longRunning1 completed")

}

suspend fun longRunning2() {
    delay(2000)
    println("longRunning2 completed")

}


