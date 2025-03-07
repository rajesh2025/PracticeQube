package coroutines.Flow

import coroutines.scopeCor
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


fun main() {

}

@OptIn(InternalCoroutinesApi::class)
suspend fun stateFlows(){
    val mutableStateFlow = MutableStateFlow(0)
    val stateFlow: StateFlow<Int> = mutableStateFlow
scopeCor.launch {
//    launch {
//        stateFlow.collect { value ->
//            println("Collector 1 received: $value")
//        }
//    }
//
//// Collect values from stateFlow
//    launch {
//        stateFlow.collect { value2 ->
//            println("Collector 2 received: $value2")
//        }
//    }
//
//// Update the state
//    launch {
//        repeat(3) { i ->
//            mutableStateFlow.value = i
//        }
//    }
}

    // Collect values from stateFlow

}

@OptIn(InternalCoroutinesApi::class)
suspend fun sharedFlows(){
    val sharedFlow = MutableSharedFlow<Int>()

//    scopeCor.launch {
//        // Collect values from sharedFlow
//        launch {
//            sharedFlow.collect {
//
//            }
//        }
//
//// Collect values from sharedFlow
//        launch {
//            sharedFlow.collect { value ->
//                println("Collector 2 received: $value")
//            }
//        }
//
//// Emit values to sharedFlow
//        launch {
//            repeat(3) { i ->
//                sharedFlow.emit(i)
//            }
//        }
//    }

}

