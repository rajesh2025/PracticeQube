fun main() {

    val ssarr= arrayOf("flower","flow","flight")
  println( longestCommonPrefix(ssarr))
}

fun longestCommonPrefix(strs: Array<String>): String {
    var prefix = strs.minBy { it.length }

    for (str in strs){
        var i = 0
        while ( i < prefix.length && str[i] == prefix[i] ){
            i++
        }
        prefix = prefix.substring(0,i)
    }

    return prefix

}
