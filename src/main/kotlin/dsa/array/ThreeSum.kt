package dsa.array

import javax.lang.model.type.ArrayType

class ThreeSum {
}
fun threeSum(nums: IntArray): List<List<Int>> {
    var n = 0
    var result = mutableListOf<List<Int>>()
    while (n < nums.size) {
        if (n + 1 < nums.size) {
            if (n + 2 < nums.size) {
                if (nums[n] + nums[n + 1] + nums[n + 2] == 0) {
                    val arr = ArrayList<Int>()
                    arr.add(nums[n])
                    arr.add(nums[n + 1])
                    arr.add(nums[n + 2])
                    result.add(arr)
                }
            }
        }
        n++
    }

    return if (result.size > 0) result
    else emptyList()
}

fun main() {
    println(threeSum(intArrayOf(-1,0,1,2,-1,-4)))
}