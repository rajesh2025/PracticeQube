package dsa.array

fun rotate(nums: IntArray, k: Int): Unit {
    val step = k % nums.size
    for (i in nums.indices) {
        var nexIndex = i + step
        nums[nexIndex] = nums[i]
    }
}

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val k = 3
    rotate3(nums, 3)
    nums.forEach {
        print(it)
    }
}








fun rotate2(nums: IntArray, k: Int) {
    val step = k % nums.size
    var count = 0
    for (start in nums.indices) {
        var current = start
        var prev = nums[current]
        do {
            val next = (current + step) % nums.size
            nums[next] = prev.also { prev = nums[next] }
            current = next
            count++
        } while (start != current)
        if (count == nums.size) break
    }
}

fun rotate3(nums: IntArray, k: Int) {
    val step = k % nums.size
    var count = 0
    var start = 0
    while (count < nums.size) {
        var current = start
        var prev = nums[current]
        do {
            val next = (current + step) % nums.size
            nums[next] = prev.also { prev = nums[next] }
            current = next
            count++
        } while (start != current)
        start++
    }
}