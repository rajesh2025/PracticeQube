package dsa.array

import java.util.Stack
import javax.xml.stream.events.Characters

fun main() {
    decodeAtIndex("leet2code3", 10)
}


fun decodeAtIndex(s: String, k: Int): String {
    val charStack = Stack<Char>()
    val digitStack = Stack<Int>()
    var totalCount = 1

    for (i in s.indices) {
        if (s[i].isDigit()) {
            val digit = Character.getNumericValue(s[i])
            digitStack.push(digit)
            totalCount = totalCount.times((digit - 1))
        } else {
            charStack.push(s[i])
        }
    }
    return ""
}
