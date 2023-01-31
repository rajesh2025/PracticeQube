package dsa.array
val nums = intArrayOf(3,2,3,2,2,2)
val nums2 = intArrayOf(9,4,18,3,2,6,18,15,7,15,6,4,15,14,7,4,15,4,3,17,9,13,13,12,2,14,12,17)

class PracticeArray {

}
fun divideArray(nums: IntArray): Boolean {
    var start = 0
    var end = nums.size - 1
    var result = arrayOfNulls<Int>(nums.size)
    while(start < end){
        if(nums[start] >= nums[end]){
            val temp = nums[start]
            nums[start] = nums[end]
            nums[end] = temp
            start++
        } else {
            end --
        }
    }
    var total = 0
    var check = false
    while(total < nums.size){
        check = nums[total] - nums[total+1] == 0
        total += 2
        if (!check) return false
    }

    return check
}


fun main() {
    nums
   println(divideArray(nums2))
}