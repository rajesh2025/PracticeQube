package dsa

import kotlin.math.sqrt

fun countPrimes(n: Int): Int {

    var countPrime = 0
    val box = BooleanArray(n+1)

    for (i in 2 .. Math.sqrt(n.toDouble()).toInt()) {
        if (!box[i]) {
            for (j in i * i .. n step+i) {
                box[j] = true
            }
        }
    }

    for (i in 2 until n) {
        if (!box[i]) countPrime++
    }

    return countPrime
}

fun main() {
    println("prime numbers are ${countPrimes(100)}")
}