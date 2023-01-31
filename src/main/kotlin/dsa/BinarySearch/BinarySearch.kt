package dsa.BinarySearch

class BinarySearch {

    fun searchUsingRec(array: Array<Int>, int: Int): Int {
        return -1
    }

    fun searchUsingLoop(array: Array<Int>, target: Int): Int {
        var start = 0
        var end = array.size - 1
        var mid: Int
        while (start <= end) {
            mid = start + (end - start)/2
            if (target == array[mid]) {
                return mid
            } else if (target > array[mid]) {
                start = mid.inc()
            } else {
                end = mid.dec()
            }
        }
        return -1
    }

    // find the ceiling - means the greater than the smallest number in array
}

fun main() {
    val arr = arrayOf(2, 3, 5, 9, 14, 16, 18)
    val target = readLine()?.toInt()
    println("index for target value is :  ${BinarySearch().searchUsingLoop(arr, target?: 0)}")
}