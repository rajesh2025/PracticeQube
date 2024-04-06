package fundamental

import utils.Utils


class DistinctInKotlin {
    val mentors = arrayOf(
        Mentor(1, "Amit Shekhar"),
        Mentor(2, "Anand Gaurav"),
        Mentor(1, "Amit Shekhar"),
        Mentor(3, "Lionel Messi"))
    init {
        val distinctList = mentors.distinct()
        println(distinctList)

        println( mentors.distinctBy { it.name })
        println( mentors.toList())

        val distinctSet = mentors.toSet()
        println(distinctSet)
    }
}

fun main() {
    DistinctInKotlin()

    val result = ::Utils
}
data class Mentor(val id: Int, val name: String)