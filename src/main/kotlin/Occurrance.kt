package com.rajesh.bluetoothlib

// count occurrence of each character in string without using hashmap.
// I/p - INDIA
// O/P - I -2 , N-1,D-1,A-1
fun main() {
    findOccurance("INDIA")
}

fun findOccurance(str:String): Array<Int>{
   val crarr = str.toCharArray()

    val coountArr = arrayOf(str.length)

    return coountArr
}