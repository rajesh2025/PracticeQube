package dsa.twosum

import dsa.array.nums
import dsa.array.nums2

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
//    println(twoSumBruteForce(nums, target))
    val result = twoSumOptimized(nums, target)

//    val result = twoSumReturnValues(nums, target)
    println(result.joinToString(", "))
}

fun twoSumBruteForce(nums: IntArray, target: Int): List<Int> {
    val list = ArrayList<Int>()
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                list.add(nums[i])
                list.add(nums[j])
            }
        }
    }
    return list
}

fun twoSumReturnValues(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    for ((index, num) in nums.withIndex()) {
        val complement = target - num
        if (map.containsKey(complement)) {
            return intArrayOf(complement, num) // Return values instead of indices
        }
        map[num] = index
    }
    return intArrayOf() // Return empty array if no solution is found
}


fun twoSumOptimized(nums: IntArray, target: Int): IntArray {
val map = mutableMapOf<Int, Int>()
    for( (index,num) in nums.withIndex()){
        val complement = target - num
        if (map.containsKey(complement)){
            return intArrayOf(map[complement]!! , index)// adding index of second num which is part of target
//            return intArrayOf(complement , num)// add num and return with complement if needed numbers instead of index
        }
        map[num] = index
    }
    return intArrayOf()
}



