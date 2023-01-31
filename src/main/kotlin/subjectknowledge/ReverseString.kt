package subjectknowledge

fun reverseString(mainStr: String): String {
    val charset = Charsets.UTF_8
    val byteArr = mainStr.toByteArray(charset)
    val length = byteArr.size
    val reverseByte = ByteArray(length)
    for (i in byteArr.indices) {
        reverseByte[i] = byteArr[length - 1 - i]
    }
    return String(reverseByte)
}
interface Production<out T> {
    fun produce(): T
}

fun main() {
println(reverseString("rajeshgoswami"))

}