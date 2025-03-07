package fundamental

class pracprac {
}

fun main() {
    val list  = arrayOf("e","a","b","e","c","j","a")

    val occurrences = list.groupingBy { it }.eachCount()
println(occurrences)

    val strtooccr = "earthecja"

   val occurrArr = strtooccr.groupingBy { it }.eachCount()
//    val arrChr = strtooccr.toCharArray()
//    val occurrArr = arrChr.groupBy { it }

    println(occurrArr)








//    val map = HashMap<String,Int>()
//
//    for (char in list){
//        if (map.containsKey(char)){
//            val value = map[char]
//            map[char] = value!!.inc()
//         } else {
//            map[char] = 1
//        }
//
//    }
//
//    println(map.toList())
}