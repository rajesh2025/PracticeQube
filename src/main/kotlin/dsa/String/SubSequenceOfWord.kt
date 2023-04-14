package dsa.String

fun subSequenceOfWord(string: String, ans: String) {

    if (string.isEmpty()) {
        println(ans)
        return
    }

    subSequenceOfWord(string.subSequence(1,string.length-1).toString(), ans + string.first())
    subSequenceOfWord(string.substring(1,string.length-1), ans)
}

fun main() {
    val cChararr = "Rajesh $ Goswami.".toCharArray()
val hmap = hashMapOf<Char,Int>()
    val string = "abc"

    for (i in cChararr.indices){

    }
    subSequenceOfWord(string, "")
}