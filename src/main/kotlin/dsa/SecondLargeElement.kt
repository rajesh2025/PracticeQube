package dsa

//without array modify
//without sorting
//with in 0(n)

fun secondLargeElement(arr: IntArray): Int {
    var largeNo = -1
    var secondLarge = -1


    for (i in arr.indices) {
        if (arr[i] > largeNo ) {
                largeNo = arr[i]
        }
    }

    for (i in arr.indices) {
        if (arr[i] != largeNo && arr[i] > secondLarge) {
            secondLarge = arr[i]
        }
    }

    return secondLarge
}

fun main() {
    println(secondLargeElement(intArrayOf(12, 57, 44, 97, 82)))
}