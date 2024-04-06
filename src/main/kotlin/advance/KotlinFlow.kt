package advance

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import java.io.IOException


class KotlinFlow {

}

fun main() {
    val retryFlow = MutableStateFlow(true)

    retryFlow.retryWhen { cause, attempt ->
        if (cause is IOException && attempt < 3) {
            delay(2000)
            return@retryWhen true
        } else {
            return@retryWhen false
        }
    }

    retryFlow.retry {
        if (it is IOException) {
            delay(200)
            return@retry true
        } else {
            return@retry false
        }
    }
}

fun parallelTask(){
runBlocking {
    val flow1 : Flow<Int> = flow{
        emit(1)
        delay(1000)
        emit(1)
    }

    val flow2 = flow{
        emit("Hello")
        delay(500)
        emit("world")
    }

    val combineFlow : Flow<Pair<Int,String>> = combine(flow1, flow2){
        num, str ->
        num to str
    }




}
}

@OptIn(ExperimentalCoroutinesApi::class)
fun CoroutineScope.foo() = produce{

    send(println(12))
    send(println(24))
}