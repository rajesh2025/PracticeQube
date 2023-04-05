package dsa.sorting

import javax.xml.crypto.Data

/*
stable sorting algorithm

*/
fun bubbleSort(intArr: IntArray) {

    val arrSize = intArr.size.minus(1)
    var (i, j) = arrayOf(0, 1)
    while (i <= arrSize) {
        while (j <= arrSize - i) {
            if (intArr[j] < intArr[j - 1]) {
                val ttemp = intArr[j]
                intArr[j] = intArr[j - 1]
                intArr[j - 1] = ttemp
            }
            j = j.inc()
        }
        j = 1
        i = i.inc()
    }

    println(IntArr(intArr).toString())
}

data class IntArr(val intArr: IntArray)
fun main() {
    bubbleSort(intArrayOf(3, 6, 7, 4, 5, 8))
}