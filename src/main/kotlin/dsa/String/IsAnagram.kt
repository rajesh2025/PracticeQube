package dsa.String

fun main() {
    val  s = "anagram"
    val t = "nagaram"

    val ss = "rat"
    val tt = "car"

    println("is anagram ${isAnagram(s,t)}  ")
    println("is anagram ${isAnagram(ss,tt)}  ")
}

fun isAnagram(s: String, t: String): Boolean {
    // If the lengths of the strings are different, they cannot be anagrams
    if (s.length != t.length) {
        return false
    }

    // Sort both strings
    val sortedS = s.toCharArray().sorted()
    val sortedT = t.toCharArray().sorted()

    // Compare the sorted versions
    return sortedS == sortedT
}
