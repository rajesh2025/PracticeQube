import kotlinx.coroutines.yield

fun main() {
    val seq = sequence {
        println("One")
        yield(1)
        println("yield 1")

        println("Two")
        yield(2)
        println("yield 2")

        println("Three")
        yield(3)
        println("yield 3")

    }

    seq.forEach {
        println(it)
    }
}