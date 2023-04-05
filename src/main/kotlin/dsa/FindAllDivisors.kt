package dsa

fun isThree(n: Int): Boolean {
    var countDivisor = 0
    var k = 0
    for (i in 1..Math.sqrt(n.toDouble()).toInt()) {
        if (n.rem(i) == 0) {
           // println(i)
            countDivisor++
        }
        k = i
    }
    for (k in k downTo 1) {
        if (n.rem(k) == 0 && k != n / k) {
         //   println(n/k)
            countDivisor++
        }
    }

    return countDivisor == 3
}

fun main() {
    isThree(4)
}