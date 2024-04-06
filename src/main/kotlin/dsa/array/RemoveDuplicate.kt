package dsa.array

fun main() {
//    println(removeDuplicates(intArrayOf(1, 1, 1, 2, 2, 3)))
    val nums = intArrayOf(0,0,0,1,1,1,1,2,2,2,3,3,3)
    println("original array size ${nums.size}")
    println(removeDuplicates(nums))
//    println(removeDuplicates2(nums))

    nums.forEach {
        print(it)
    }


}

fun removeDuplicates(nums: IntArray): Int {
    val size = nums.size - 1
    var uniqueCount = 2

    for (i in 2..size) {
        if (nums[i] != nums[uniqueCount - 2]) {
            nums[uniqueCount] = nums[i]
            uniqueCount++
        }

    }
    return uniqueCount
}

fun removeDuplicates2(nums: IntArray): Int {
    if (nums.size <= 2) return nums.size

    var index = 2
    for (i in 2 until nums.size) {
        if (nums[i] != nums[index - 2]) {
            nums[index] = nums[i]
            index++
        }
    }
    return index
}
//
// && (uniqueCount == -1 || nums[uniqueCount] != 1 )