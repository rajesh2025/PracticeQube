package collections

import MultiThreaading.Person

data class Peirson(val name:String, val attributes: List<String>)
fun main(){
    //flatMap on list of string transform to list
    val nameList = listOf("Jane", "Doe","John", "Doe")
    val result = nameList.flatMap { it.toList() }
    println(result)
    //flatMap on list of strings
    flatMap()
    //map vs flatMap on list of strings
    mapVsFlatmap()
// manual map filtering
    mapFilter()

    // filter map
    filterMap()
}

fun flatMap(){
    val people = listOf(
        Peirson("Alice",listOf("Friendly","Adventurous")),
        Peirson("Bob", listOf("Outgoing", "Courteous"))
    )
    val attributes = people.flatMap { it.attributes }
    println(attributes)
}

fun mapVsFlatmap(){
    val listOfLists = listOf(listOf(1,2,3), listOf(4,5), listOf(6,7,8))
    val mapResult = listOfLists.map { it }
    val flatmapResult = listOfLists.flatMap { it }
    println(mapResult)
    println(flatmapResult)
}

fun mapFilter(){
    val numbersMap = mapOf("key1" to 1,"key2" to 2, "key3" to 3, "key11" to 11)
    val filterMap = numbersMap.filter { (key,value)-> key.endsWith("1") && value > 10 }
    println(filterMap)
}

fun filterMap(){
    val map1 = mapOf("rajesh" to "goswami","hello" to "world", "vande" to "matram")
   val filteredmap = map1.entries.filter {it.value.length > 5  }

    println(filteredmap)
}