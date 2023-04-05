package subjectknowledge

fun test() {
    var mood = "I am sad".run {
        val mood = "I am happy"
        println(mood) // I am happy
    }
    println(mood)  // I am sad
}

fun main() {
    test()
}

