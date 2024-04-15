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

//viewModelScope.launch {
//    val data1Response:BaseResponse<Data1>?
//    val data2Response: BaseResponse<Data2>?
//    val data3Response: BaseResponse<Data3>?
//    val call1 = async { repository.getAPIcall1()}
//    val call2 = async { repository.getAPIcall2()}
//    val call3 = async { repository.getAPIcall3() }
//    try {
//        data1Response = call1.await()
//        data2Response = call2.await()
//        data3Response = call3.await()
//    } catch (ex: Exception) {
//        ex.printStackTrace()
//    }
//    processData(data1Response, data2Response, data3Response)
//}

//suspend fun fetchData() =
//    coroutineScope {
//        val mergedResponse = listOf(
//            async { getAPIcall1() },
//            async { getAPIcall2() }
//        )
//        mergedResponse.awaitAll()
//    }

// 2nd
//viewModelScope.launch {
//    withContext(Dispatchers.Default) {
//        val apiResponse1 = api.getAPICall1()
//        val apiResponse2 = api.getAPICall2()
//        if (apiResponse1.isSuccessful() && apiResponse2.isSuccessful() { .. }
//    }
//}

//3rd
//repository.getData1()
//.zip(repository.getData2()) { data1, data2 ->
//    return@zip data1 + data2
//}
//.flowOn(Dispatchers.IO)
//.catch { e ->
//    ..
//}
//.collect { it ->
//    handleSuccessResponse(..)
//}