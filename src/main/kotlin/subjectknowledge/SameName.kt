package subjectknowledge

import kotlin.math.abs

open class SameName{
    fun myName(){

arrayListOf<Int>()
    }
}

fun main() {
    println(findDuplicates(intArrayOf(4,3,2,7,8,2,3,1)))
    println(findDuplicates(intArrayOf(1,1,2)))
}
fun findDuplicates(nums: IntArray): List<Int> {
    var index  = 0
    val arraylist = arrayListOf<Int>()
    for((i,n) in nums.withIndex()){
        index = abs(nums[i]) - 1
        if(nums[index] < 0 ){
            arraylist.add(index+1)
        }
        nums[index] = -nums[index]

    }
    return arraylist.toList()
}