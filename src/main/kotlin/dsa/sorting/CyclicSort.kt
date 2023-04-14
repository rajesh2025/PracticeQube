package dsa

fun main() {

//    println(missingNumber(intArrayOf(3, 0, 1)))
//    println(missingNumber(intArrayOf(0, 1)))
//    println(missingNumber(intArrayOf(1,2)))
//    println(missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
//    println(missingNumber(intArrayOf(0,3,2)))
//    println(missingNumber(intArrayOf(0)))
    println(missingNumber(intArrayOf(1)))
}


fun missingNumber(nums: IntArray): Int {
    var startIndex = 0
    val endIndex = nums.size - 1

    while (startIndex <= endIndex) {
        if (nums[startIndex] <= endIndex && nums[startIndex] != startIndex) {
            val temp = nums[startIndex]
            val move = nums[temp]
            nums[temp] = temp
            nums[startIndex] = move
        } else {
            startIndex = startIndex.inc()
        }
    }

    for (i in nums.indices) {
        if (nums[i] != i) return i
    }

    if (nums.size != nums[endIndex]) {
        return nums.size
    }

    return -1
}