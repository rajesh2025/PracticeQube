package coroutines

import kotlinx.coroutines.*

suspend fun fetchUserProfile(): String {
    delay(2000) // Simulating API call delay
    throw RuntimeException("fetch user profile failed")
    // return "User Profile Loaded"
}

suspend fun fetchUserOrders(): String {
    delay(3000) // Simulating API call delay
    return "User Orders Loaded"
}

suspend fun fetchUserNotifications(): String {
    delay(1000) // Simulating API call delay
//    return "User Notifications Loaded"
    throw RuntimeException("fetch user Notification failed")
}

 suspend fun main() {
    coroutineScope{
        val deferred1 = async { fetchUserProfile() }
        val deferred2 = async { fetchUserOrders() }
        val deferred3 = async { fetchUserNotifications() }
        try {
            val results = awaitAll(deferred1, deferred2, deferred3) // ✅ Wait for all tasks to finish
            println(results) // ✅ Prints: [User Profile Loaded, User Orders Loaded, User Notifications Loaded]

        } catch (e: Exception) {
            println("inside catch exception ${e.message}")
        }


    }

//    coroutineScope {
//        val deferred4 = async {
//            fetchUserOrders()
//        }
//        println("deferred4 ${deferred4.await()}")
//    }
}
