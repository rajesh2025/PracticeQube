package dsa

fun distinctPrimeFactors(nums: IntArray): Int {
    val setOfSet = mutableSetOf<Int>()
    for (i in nums) {
        setOfSet.addAll(primeFactors(i))
    }
    return setOfSet.size
}

fun primeFactors(n: Int): MutableSet<Int> {
    var arr = mutableSetOf<Int>()
    var i = 2
    var localNum = n
    while (i.times(i) <= localNum) {
        while (localNum.rem(i) == 0) {
            arr.add(i)
            localNum = localNum.div(i)
        }
        i++
    }
    if (localNum > 1) {
        arr.add( localNum)
    }

    return arr
}

fun main() {
   println(distinctPrimeFactors(intArrayOf(2, 4, 3, 7, 10, 6)))
   println(distinctPrimeFactors(intArrayOf(2,4,8,16)))
}