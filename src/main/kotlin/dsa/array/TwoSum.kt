package dsa.array

fun main() {
//    val nums = intArrayOf(2,7,11,15)
    val nums = intArrayOf(3,2,4)
//    val target = 9
    val target = 6
    twoSum(nums, target).forEach {
        print(it)
    }

}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var i = 0
    var j = nums.size - 1
    val arrayOf2 = IntArray(2)
val  s = buildString {  }

    while (i <= j) {
        if (nums[i] + nums[j] == target) {
            arrayOf2[0] = i
            arrayOf2[1] = j
            break
        } else if (nums[i] + nums[j] < target) {
            i++
        } else if (nums[i] + nums[j] > target) {
            j--
        }
    }
    return arrayOf2

}