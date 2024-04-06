package dsa

import java.util.Stack

class ReverseAString {

    companion object {
        fun reverseWords(s: String): String {
            val oneCharArr = s.trim().toCharArray()
            val stack = Stack<Char>()
            val size = oneCharArr.size - 1
            var temp = ' '
            var spaceCount = 0
            for (i in 0..size) {
//            if (oneCharArr[i] == oneCharArr[size -i] &&
//                oneCharArr[i] == ' '
//                && spaceCount < 2
//            ) {
//                spaceCount = spaceCount.inc()
//            } else if (oneCharArr[i] == oneCharArr[size -i]
//                && oneCharArr[i] == ' '
//                && spaceCount > 1
//            ) {
//                temp = oneCharArr[i]
//                oneCharArr[i] = oneCharArr[size -i]
//                oneCharArr[size -i] = temp
//            } else {
                if (oneCharArr[i] != ' ') {
                    stack.add(oneCharArr[i])
                } else {
                    if (i - 1 >= 0 && stack.lastIndexOf(' ') == i - 1) {
                        continue
                    } else {
                        stack.push(oneCharArr[i])
                    }
                }
//                temp = oneCharArr[i]
//                oneCharArr[i] = oneCharArr[size - i]
//                oneCharArr[size - i] = temp
//                println("${oneCharArr[i]}")
//            }

            }
            return stack.toString()
        }
    }
}

fun main() {
    println(ReverseAString.reverseWords("the sky is blue"))
    println(reverseWords("the sky is blue"))
    var int :Int = 8

}

fun reverseWords(s: String): String {
    val words = s.trim().split("\\s+".toRegex()).reversed()
    println(words)
    return words.joinToString(" ")
}