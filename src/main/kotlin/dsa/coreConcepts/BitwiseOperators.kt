package dsa.coreConcepts
//0101
//0110
//0111
fun rangeBitwiseAnd(left: Int, right: Int): Int {
    var andResult = 1

    for(i in left..right){
        andResult += left.and(andResult)
    }
    return andResult + 1
}

fun main(args: Array<String>) {
    println(rangeBitwiseAnd(5, 7))
}