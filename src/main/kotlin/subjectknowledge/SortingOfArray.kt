package subjectknowledge

class SortingOfArray {

    fun sortTheArray(intArray: IntArray): Array<Int> {

        return intArray.sortedArray().toTypedArray()
    }

}

fun main() {
println(Solution().isPalindrome(100))
}

class Solution {
    fun isPalindrome(x: Int): Boolean {
        var number = x
        if (number == 0) {
            return true
        }
        if (number < 0 || number % 10 == 0) {
            return false
        }

        var reversedInt = 0
        while (number > reversedInt) {
            val pop = number % 10
            reversedInt = (reversedInt * 10 )+ pop
            number /= 10
        }
        return number == reversedInt || number == (reversedInt / 10)
    }

    class Solution {
        fun is2Palindrome(x: Int): Boolean {
            var k :Int  = x
            var palindromeN = 0
            while(k > palindromeN) {
                val n = k % 10
                palindromeN  = palindromeN * 10 + n
                k /= 10
            }

            return palindromeN == k || (palindromeN/10 == k) || (x in 0..9)

        }
    }
}

