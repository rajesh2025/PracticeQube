package advance

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.internal.NopCollector.emit
import subjectknowledge.User
import java.lang.Exception
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

class CoroutinesExceptionHandling {
}

fun main(){
    val scope = CoroutineScope(Dispatchers.IO)
    scope.launch {
        try {
            someExceptionThrowingWork()

        }catch (e : Exception){
            println("Job1 threw $e")
        }

    }

    scope.launch {
        delay(500)
        println("Job finished")
    }.invokeOnCompletion {
        cause: Throwable? ->
        if (cause is CancellationException){
            println("Job is cancelled")
        }
    }

    Thread.sleep(1000)
}

private suspend fun someExceptionThrowingWork(){
    delay(200)

    val user = User("Alice", 30)
   val ss = user.also { println("Created user: ${it.name}") } // Perform side effect after object creation

    val user2 = User("rajesh", 30)
    user2.applyTo{ it->
        println("Created user with applyTo : ${it.name}")
    }
    throw RuntimeException()



}

 @OptIn(ExperimentalContracts::class)
 inline fun  <T> T.applyTo(block: (T) -> Unit) : T {
     contract {
         callsInPlace(block, InvocationKind.EXACTLY_ONCE)
     }
     block(this)
     return this
}

fun main2() = kotlinx.coroutines.runBlocking() {


    val flow1 = flow {
        delay(1000)
        emit("Flow 1 Success")
    }.catch { emit("Flow 1 Failed: ${it.message}") }

    val flow2 = flow {
        delay(2000)
        throw RuntimeException("Network error") // Simulated failure
    }.catch { emit("Flow 2 Failed: ${it.message}") }

    combine(flow1, flow2) { result1, result2 ->
        "Result: $result1, $result2"
    }.collect { println(it) }
}