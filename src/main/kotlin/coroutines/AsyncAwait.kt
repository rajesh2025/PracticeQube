import kotlinx.coroutines.*

fun mainAysnc() = CoroutineScope(Dispatchers.Default).launch {
    println(Thread.currentThread().name)
    val task = listOf(
        async {
            println("${"task 11"} ${Thread.currentThread().name}")
            delay(4000)
            println("${"task 12"} ${Thread.currentThread().name}")
            "Response #1"
        },
        async {
            println("${"task 21"} ${Thread.currentThread().name}")
            delay(4000)
            println("${"task 22"} ${Thread.currentThread().name}")
            "Response #2"
        }
    )

    val result = task.awaitAll()
    println("Response received: ${result[0]} and ${result[1]}")
}

suspend fun parentCoroutine() {
    coroutineScope { // Creates a new coroutine scope
        launch { // Child coroutine
            repeat(5) { i ->
                delay(1000)
                println("Child coroutine running $i")
            }
        }
        println("Parent coroutine started")
    }
    println("Parent coroutine completed")
}

fun main() = runBlocking {
    parentCoroutine()
}

private var _state : String = ""
    set(value){
       if (value.isNotEmpty()) {
       field = value
       }
    }


