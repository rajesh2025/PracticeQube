package dsa
fun main() {
    mainL()
    val array1 = arrayOf("a", "b", "c")
    val array2 = arrayOf("1", "2", "3", "4", "5")


    var smallArr = emptyArray<String>()
    var bigArray = emptyArray<String>()
    smallArr = if (array2.size < array1.size) {
        bigArray = array1
        array2
    } else {
        bigArray = array2
        array1
    }

    for (i in 0..smallArr.size-1) {
        val item1 = smallArr[i] + bigArray[i]
        bigArray[i] = item1
    }


    for (i in 0..bigArray.size-1){
        println(bigArray[i])
    }

//    bigArray.forEach { it.strin }

}
//C[]={ "a" "1" "b" "2" "c" "3" "4" "5"}
//array 1 String

fun mainL() {
    //
    val input = "Rajesh $ goswami."
    val charMap  = HashMap<Char,Int>()
    val charArr = input.toCharArray()

    for(i in charArr.indices){
        if(charMap.contains('$')){
            continue
        }
        if(charMap.contains('.')){
            continue
        }
        if(charMap.contains(' ')){
            continue
        }
        if (charMap.contains(charArr[i])){
            val value = charMap[charArr[i]]?.inc()
            charMap[charArr[i]] = value!!
        } else {
            charMap[charArr[i]] = 1
        }


    }

    charMap.forEach { println("${it.key} ${it.value} ") }




    println("Hello, world!!!")
}