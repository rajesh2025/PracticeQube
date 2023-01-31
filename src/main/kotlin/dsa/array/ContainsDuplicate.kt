package dsa.array

class ContainsDuplicate {

}

val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 9)
val array1 = intArrayOf(1,2,3,1)
val array2 = intArrayOf(1,0,1,1)
val array3 = intArrayOf(1,2,3,1,2,3)

fun main() {
    println(containsNearbyDuplicate(array3, 2))
}

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    var i = 0
    var j = i + 1
    while (j < nums.size) {
        val diff = j - i
        if (nums[i] == nums[j] && diff <= k) {
            return true
        } else {
            if (diff < k && j+1 < nums.size) {
                j++
            } else {
                i++
                j = i + 1
            }
        }
    }
    return false
}

