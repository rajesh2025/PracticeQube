package dsa.String

fun main() {
//    println(wordPattern("abba", "dog cat cat dog"))
    println(wordPattern( pattern = "abba", s = "dog cat cat fish"))
//    println(wordPattern( pattern = "aaaa", s = "dog cat cat dog"))
}

fun wordPattern(pattern: String, s: String): Boolean {
val list = s.split(" ")
    if(list.size != pattern.length){
        return false
    }
    val wordCharMap = mutableMapOf<String,Char>()
    for (index in list.indices){
        val word = list[index]
        val char = pattern[index]
        if (wordCharMap.containsValue(char)){
            val existingWord = wordCharMap.entries.firstOrNull{it.value == char }?.key
            if (existingWord != word){
                return false
            }
        } else {
            if (wordCharMap.containsKey(word)){
                return false
            }
            wordCharMap[word] = char
        }

    }

    return true
}