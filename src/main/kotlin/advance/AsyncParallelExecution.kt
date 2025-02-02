package advance

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    launchfun()
}

fun launchfun() = runBlocking {
    val time = measureTimeMillis {
      coroutineScope {
//            val task1 = async { task1(1,500) }
//            val str = task1.await()
//            println("task1 str: $str")
            val timesubtask = measureTimeMillis {

                withContext(Dispatchers.Default){
                    val task2 = task2(2, 1000)
             task3(3, 400)
                }

//                task2.start()
//                task3.start()
//                println("task2: "+ task3.join() + task2.join())

            }
            println("timesubtask: $timesubtask")
        }
    }
    println("coroutineScope: total time $time")
}
fun asyncfun() = runBlocking {
    val time = measureTimeMillis {
        val result = coroutineScope {
            val task1 = async { task1(1,500) }
            val str = task1.await()
            println("task1 str: $str")
            val timesubtask = measureTimeMillis {
                val task2 = async { task2(2, 1000) }
                val task3 = async { task3(3, 400) }
                println("task2: "+ task2.await() + " task3: "+ task3.await())

            }
            println("timesubtask: $timesubtask")
        }
    }
    println("coroutineScope: total time $time")
}

suspend fun task1(id: Int, delayTime: Long) : String {
    delay(delayTime) // Simulate work
    println("Task $id completed after $delayTime ms")
    return "Result from Task $id"
}

suspend fun task2(id: Int, delayTime: Long) : String {
    delay(delayTime) // Simulate work
    println("Task $id completed after $delayTime ms")
    return "Result from Task $id"
}

suspend fun task3(id: Int, delayTime: Long) : String {
    delay(delayTime) // Simulate work
    println("Task $id completed after $delayTime ms")
    return "Result from Task $id"
}