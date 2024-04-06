package fundamental




class HigherOrderFunction {

    fun <T, R> Collection<T>.foldCopy(
        initial: R,
        combine: (acc: R, nexElement: T) -> R
    ): R {
        var accumulator: R = initial

        for (element: T in this) {
            accumulator = combine(accumulator, element)
        }
        return accumulator
    }


}


fun addTwoNumbers(a:Int, b:Int, action: (Int)->Unit){
val sum = a + b
    action.invoke(sum)
}
fun main() {
    // fold higher
    val kList = listOf(1, 2, 3, 4, 5)
    HigherOrderFunction().apply {

        kList.foldCopy(0
        ) { acc: Int, i: Int ->
            print("acc: $acc, i= $i ")
            val result = acc + i
            println(" result $result")
            result
        }
        //parameters types in lambda are optional if they can be inferred
        val joinedToString = kList.foldCopy( "Elements:") { acc, i ->
            "$acc $i"
        }

        // Function references can also be used for higher-order function calls
//        val product = kList.fold(1, Int::times)

        addTwoNumbers(3, 5) { s -> println(s) }

    }

}