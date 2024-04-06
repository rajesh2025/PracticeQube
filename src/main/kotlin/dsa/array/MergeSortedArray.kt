package dsa.array

fun main() {
    var nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    var nums2 = intArrayOf(2, 5, 6)
    var m = 3
    var n = 3
    merge(nums1, m, nums2, n)
    nums1.forEach { print(it) }

    println()

    nums1 = intArrayOf(0)
    m = 0
    nums2 = intArrayOf(1)
    n = 1
    merge(nums1, m, nums2, n)

    nums1.forEach { print(it) }

}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    var i = m - 1
    var j = n - 1
    var k = m + n - 1

    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k] = nums1[i]
            i--
        } else {
            nums1[k] = nums2[j]
            j--
        }
        k--
    }

    println()
    while (j >= 0) {
        nums1[k] = nums2[j]
        j--
        k--
    }
}