package advance

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import org.junit.Assert

fun coroutinesEx() {
    runBlocking {
        val deferredResult: Deferred<Int> = async {
            // Background task that takes some time
            delay(1000) // Simulate some work
            return@async 5 // Return the result
        }

        // Do something else while the background task is running
        println("Waiting for async result...")

        // Wait for the result and use it
        val result = deferredResult.await()
        println("Async result: $result")

        // Launch a coroutine for a fire-and-forget task
        launch {
            // Background task with side effects (no result)
            delay(2000)
            println("Background task completed!")
        }

        println("Main thread continues...")
    }
}

suspend fun main() = coroutineScope {
    val job = Job()
    launch (job) {
        try {
            println("Coroutine started")
            delay(200)
            println("Coroutine finished")
        } finally {
            println("Finally")
            withContext(NonCancellable) {
                launch {
                    println("Children executed")
                }
                delay(1000L)
                println("Cleanup done")
            }
        }
    }
    delay(300)
    job.cancelAndJoin()
    println("Done")

    given_channel_when_pass_data_from_one_coroutine_then_receive_in_another()
}


fun given_channel_when_pass_data_from_one_coroutine_then_receive_in_another() = runBlocking {
    val channel = Channel<Int>()
    launch { // coroutine #1
        for (i in 1..50) {
            delay(100L)
            channel.send(i)
        }
        channel.close()
    }
    val result = async { // coroutine #2
        buildString {
            channel.consumeEach {
                append(it).append(", ")
            }
        }.removeSuffix(", ")
    }
//    Assert.assertEquals("1, 2, 3, 4, 5", result.await())
    println(result.await())
}
