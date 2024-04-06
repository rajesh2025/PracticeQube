package MultiThreaading

class ThreadSyncronization {

//    private
}


class Person(val name: String, val age: Int) {



    // Secondary Constructor
    constructor(name: String) : this("", 0) {
        println("Secondary constructor called with name: $name")
    }

    constructor(name: Float) : this("", 0) {
        println("Secondary constructor called with name: $name")
    }
}

fun main() {
    Person("user1")
}