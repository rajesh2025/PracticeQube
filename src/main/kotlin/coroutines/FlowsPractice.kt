package coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import mainAysnc
import java.io.IOException


suspend fun main(){
//    retryFunction()
    mainAysnc()
}

@OptIn(ExperimentalCoroutinesApi::class)
suspend fun mergeFunction(){
    val intN: Flow<Int> = flowOf(1,2,3)
    val doubleN : Flow<Double> = flowOf(1.0,2.0,3.0)

    val together  = merge(intN,doubleN)
    println(together.toList())
}


suspend fun zipFunction(){
    val flow1: Flow<Int> = flowOf(1,2,3)
    val flow2: Flow<Char> = flowOf('A','B','C')
    val zipTogether = flow1.zip(flow2){i,c -> "$i -> $c"}.collect{println(it)}

}

suspend fun retryFunction(){
    val fl1 = flow {
        delay(3000)
        emit(1)
        throw IOException()
    }.retry(2) {
        true
    }

    var currentDelay = 1000L
    val delayFactor = 2
    fl1.
    flowOn(Dispatchers.Default)
        .retry(retries = 3) { cause ->
        if (cause is IOException) {
            delay(currentDelay)
            currentDelay = (currentDelay * delayFactor)
            return@retry true
        } else {
            return@retry false
        }
    }.catch {
    }.collect {

    }
}

val scope = SupervisorJob()

suspend fun parallelExecution(){

}


