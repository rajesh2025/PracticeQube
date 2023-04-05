package dsa

fun subarrayLCM(nums: IntArray, k: Int): Int {
    var subArrayCount: Int = 0
    var i = 0
    var j = i + 1
    while (j <= nums.size - 1) {
        val lcm = findLCM(nums[i], nums[j])
        if (nums[i] == k) {
            subArrayCount++
        }
        if (lcm == k && (i + 1) == j) {
            subArrayCount++
            i = j
        }

        j++
    }

    return subArrayCount
}

fun findLCM(numberOne: Int, numberTwo: Int): Int = (numberOne * numberTwo) / findGCD(numberOne, numberTwo)


fun main() {

    println(subarrayLCM(intArrayOf(3, 6, 2, 7, 1), 6))
}

fun findGCD(numberOne: Int, numberTwo: Int): Int {
    var i = numberOne
    var j = numberTwo

    while (i != 0 && j != 0) {
        if (i > j)
            i = i.rem(j)
        else
            j = j.rem(i)

    }
    return if (i != 0) i else j
}
