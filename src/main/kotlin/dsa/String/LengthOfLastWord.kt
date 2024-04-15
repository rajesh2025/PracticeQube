package dsa.String

fun main() {
    println(lengthOfLastWord("Hello World"))
}

fun lengthOfLastWord(s: String): Int {
    var lastLength = 0
    val cArr = s.toCharArray()
    for (index in cArr.size - 1 downTo 0) {
        if (cArr[index] != ' ') {
            lastLength++
        } else {
            break
        }
    }
    return lastLength
}