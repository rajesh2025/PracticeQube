package dsa

import kotlin.random.Random

fun main() {
//    val uniqueNumbers = mutableListOf<Int>()
//
//    // Generate unique numbers until the list size reaches 100
//    while (uniqueNumbers.size < 100) {
//        val randomNumber = Random.nextInt(101) // Generate a random number between 0 and 100
//        if (!uniqueNumbers.contains(randomNumber)) {
//            uniqueNumbers.add(randomNumber)
//        }
//    }

    // Print the unique numbers
//    println("Unique numbers from 0 to 100:")
//    uniqueNumbers.forEach { println(it) }
//crossline
    performAction {
        println(capturedValue)  // Accesses capturedValue from outside the inline function
    }

// inline
    downloadData("https://example.com/data.txt") { data ->
        // Perform complex data processing here (not inlined)
        println(data.toUpperCase())
    }

    // print inline
    println(result)

}

var capturedValue = 0

inline fun performAction(crossinline action: () -> Unit) {
    capturedValue = 10
    action()
}



inline fun downloadData(url: String,noinline onSuccess: (data: String) -> Unit) {
    // Download logic
    onSuccess("Downloaded data")
}

inline fun add(x: Int, y: Int) = x + y

val result = add(5, 3)  // Inline function body is copied here

