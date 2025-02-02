package advance

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

suspend fun main() {
//    main2()
    main3()
}
suspend fun main2() {
    val channel = Channel<Int>()

    val job1 = GlobalScope.launch {
        repeat(3) { count ->

                println("Executing $count of Task 1")
                delay(500)
                channel.send(2)

        }
    }

    val job2 = GlobalScope.launch {
        repeat(3) { count ->
            val receiveInt = channel.receive()
            if(receiveInt == 2){
                println("Executing $count of Task 2")
                delay(500)
                channel.send(3)
            }

        }
    }

    val job3 = GlobalScope.launch {
        repeat(3) { count ->
            val receiveInt = channel.receive()
            if(receiveInt == 3){
                println("Executing $count of Task 3")
                delay(500)
//                channel.send(1)
            }
        }
    }


    job1.join()
    job2.join()
    job3.join()
    channel.close()
}


suspend fun main3() {
    coroutineScope {
        launch { task1() }
        launch { task2() }
        launch { task3() }
    }
}

suspend fun task1() {
    repeat(1) { count ->
        println("Task 1: Executing count $count")
        delay(1000) // Simulating some task execution
//        println("Task 1: Delayed for 1 second")
    }
}

suspend fun task2() {
    repeat(1) { count ->
        println("Task 2: Executing count $count")
        delay(500) // Simulating some task execution
//        println("Task 2: Delayed for 1.5 seconds")
    }
}

suspend fun task3() {
    repeat(1) { count ->
        println("Task 3: Executing count $count")
        delay(500) // Simulating some task execution
//        println("Task 3: Delayed for 2 seconds")
    }
}

