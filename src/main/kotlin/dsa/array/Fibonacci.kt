package dsa.array

import java.util.Stack

class Fibonacci {

}

fun main() {
//    println(fib(4))
   Fibonacci(4)
    val s : String ="sdsd"
    s.toCharArray()

    val stack = Stack<Int>()
}

fun fib(n: Int): Int {
    if (n < 2) {
        return n
    } else return fib(n - 1) + fib(n - 2)
}

fun Fibonacci(n:Int):Int{
    var temp1 = 0
    var temp2 = 1
    for(i in 1..n){
        println(temp1)
        val sum = temp1 + temp2
        temp1 = temp2
        temp2 = sum
    }
    return temp2
}