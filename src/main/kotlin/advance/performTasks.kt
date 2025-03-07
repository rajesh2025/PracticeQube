package advance

import kotlinx.coroutines.*

fun main() {
    CoroutineScope(Dispatchers.Default).launch{
        performTasks()
    }
}
suspend fun performTasks() = coroutineScope {
    launch { 
        withContext(Dispatchers.IO) { fetchData() }
    }
    
    launch { 
        withContext(Dispatchers.Default) { processData() } 
    }
}

suspend fun processData() {
    delay(2000)
}

suspend fun fetchData() {
    delay(1000)
}
