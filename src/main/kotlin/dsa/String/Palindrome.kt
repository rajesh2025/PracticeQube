package dsa.String

import java.util.*

fun main() {
println("isPalindrome ${isPalindrome("A man, a plan, a canal: Panama")}  ")
println("isPalindrome ${isPalindrome("race a car")}  ")
println("isPalindrome ${isPalindrome(" ")}  ")
println("isPalindrome ${isPalindrome("0P")}  ")


}

fun isPalindrome(s: String): Boolean {
    var sArr = s.lowercase(Locale.getDefault()).toCharArray()
   var ss= sArr.sortedArray().toString()
    val stringBuilder = StringBuilder()
    for(c in sArr){
        if(c.code in 97..122){
            stringBuilder.append(c)
        }
    }
    val s2 = stringBuilder.toString()

    if (s2.length == 1 && s2[0] != ' '){
        return false
    }

    var i = 0
    var j = s2.length -1
    sArr = s2.toCharArray()
    while(i <= j){
        if(sArr[i] != sArr[j]){
            return false
        }
        i++
        j--
    }
    return true
}

fun isPalindrome2(s: String): Boolean {
    val cleanStr = s.toLowerCase().filter { it.isLetterOrDigit() }
    return cleanStr == cleanStr.reversed()
}

