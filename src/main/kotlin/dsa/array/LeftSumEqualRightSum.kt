package dsa.array

fun main() {
    println(balancedSums(arrayOf(5, 6, 8, 11)))
    println(balancedSums(arrayOf(1, 2, 3)))
    println(balancedSums(arrayOf(1, 2, 3, 3)))
    println(balancedSums(arrayOf(1 ,1, 4, 1, 1)))
    println(balancedSums(arrayOf(2 ,0, 0, 0)))
    println(balancedSums(arrayOf(0, 0, 2, 0)))
}

fun balancedSums(arr: Array<Int>): String {
    var checkBalance = false
    var j = (arr.size - 1)
    var i = 0
    var leftSum = arr[i]
    var rightSum = arr[j]
    while (i <= j) {
        if (leftSum == rightSum) {
            checkBalance = true
            break
        }
        if (leftSum > rightSum) {
            j--
            rightSum += arr[j]
        } else {
            i++
            leftSum += arr[i]
        }

    }

    if (checkBalance) {
        return "YES"
    }

    return "NO"
}