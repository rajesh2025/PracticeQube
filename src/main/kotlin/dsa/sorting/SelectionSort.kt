package dsa.sorting

/*
stable sorting algorithm
step 1 - in selection sort we move max item to end of the list
and remaining sub list will be sort through step 1 way only but no need to select item of sorted sub list
which is being made in parallel of these steps
*/
fun selectionSort(intArr: IntArray) {

    val arrSize = intArr.size.minus(1)
    var (i, j) = arrayOf(0, 1)
    var maxNum = 0
    var maxIndex = 0
    while (i <= arrSize) {
        while (j <= arrSize - i) {
            if (intArr[j] > maxNum) {
                maxIndex = j
                maxNum = intArr[j]

            }
            j = j.inc()
        }
        // swap
        val temp = intArr[arrSize - i]
        intArr[arrSize - i] = intArr[maxIndex]
        intArr[maxIndex] = temp
        j = 1
        maxIndex = 0
        maxNum = 0
        i = i.inc()
    }

    println(intArr.toList())
}


fun main() {
   // selectionSort(intArrayOf(3, 6, 7, 4, 5, 7, 9, 5, 8, 3, 8))
    selectionSortStriver(arrayOf(13,46,24,52,20,9))
//    data class IntArr(val intArr: IntArray)
}


//we are going till n-2 in first loop becoz this condition is required to validate till second last element of the array
fun selectionSortStriver(intArr: Array<Int>) {
    for (i in intArr.indices) {
        var min = i
        for (j in intArr.indices) {
            if (intArr[j] < intArr[min]) {
                min = j
            }
        }
        val temp = intArr[min]
        intArr[min] = intArr[i]
        intArr[i] = temp
    }

    intArr.forEach { print("$it ") }
}