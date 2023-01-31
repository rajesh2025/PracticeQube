package subjectknowledge

open class SameNameTwo(secondName: String) {
    private var nameMine = "abhuday start"

    init {
        nameMine = "saraswat 1"
        println(nameMine)
    }

    constructor(firstName: String = "sabass", secondName: String) : this(secondName) {
        println(firstName)
    }

    init {
        nameMine = "saraswat 2"
        println(nameMine)

    }
}

fun main() {
    val alice = Person().apply {
        this.age = 30
        this.name = "Rajesh"
    }
    run(){

    }


    val service = Person("https://example.kotlinlang.org", 80)

    val result = service.run {
        age = 8080
        name = " to port $age"
    }

// the same code written with let() function:
    val letResult = service.let {
        it.age = 8080
        it.name = " to port ${it.age}"
    }

}
