package dsa.String

fun main() {
   println(reverseWords("Let's take LeetCode contest"))
}


fun reverseWords(s: String): String {
    var i = 0
    var j = 0
    val sBuilder = StringBuilder()
    for ( ch in s.toCharArray()) {
//
        if (ch != ' ') {
            j++
        } else {
            j += i
            val tempStr = s.substring(i,j)
            for (cTemp in tempStr.reversed()) {
                sBuilder.append(cTemp)
            }
            sBuilder.append(' ')
            i = j+1
            j = 0

        }
    }
    //last word changes
    j += i
    val tempStr = s.substring(i,j)
    for (cTemp in tempStr.reversed()) {
        sBuilder.append(cTemp)
    }

    return sBuilder.toString()
}
