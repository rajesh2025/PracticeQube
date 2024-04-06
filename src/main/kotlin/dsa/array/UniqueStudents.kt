package dsa.array
// you work in a university registrar's office you habe been tasked with removing duplicates from the registration
// for final exams
//given an array of integer a containing the unique student ID of students write a function that removes any duplicate numbers
// and returns a new array in which the ordering of the ID numbers remaining the same as it was in the original
// array , not that all students are 5-digit numbers beginning with the number 5

//---------------------------------
//Input parameters: (arrayOf(52311, 52311, 55125, 55125, 52128, 52130, 52128) )
//Result: (52311, 55125, 52128, 52130)
//OK
//---------------------------------
//Input parameters: (arrayOf(59100, 58200, 58200, 51190, 58200) )
//Result: (59100, 58200, 51190)
//OK
//---------------------------------
//Input parameters: (arrayOf(54321, 54321, 54321, 54321, 54321) )
//Result: (54321)
//OK
//---------------------------------
//Input parameters: (arrayOf(54321, 53421, 53241, 53214, 54231, 54213, 54312) )
//Result: (54321, 53421, 53241, 53214, 54231, 54213, 54312)
//OK

fun getUniqueStudentIds(a: Array<Int>): Array<Int> {
    if (a.firstOrNull { it < 50000 || it > 59999 } != null) {
        return arrayOf(-1)
    }

    return a.distinct().toTypedArray()
}

fun getUniqueStudentIdsMine(a: Array<Int>): Array<Int> {


    var uniqueStudent = 1
    for (i in 1 untilMine a.size) {
        if (a[i] != a[i - 1]) {
            a[uniqueStudent] = a[i]
            uniqueStudent++
        }
    }
    return a.sliceArray(0  until  uniqueStudent-1 )
}

fun main() {


    val arr = getUniqueStudentIds(arrayOf(52311, 52311, 55125, 55125, 52128, 52130, 52128))
    val arrMine = getUniqueStudentIdsMine(arrayOf(52311, 52311, 55125, 55125, 52128, 52130, 52128))
    arr.forEach {
        print(it)
        print(" , ")
    }
    println()
    arrMine.forEach {
        print(it)
        print(" , ")
    }
}

infix fun Int.untilMine(num: Int): IntRange {
    if (num <= Int.MIN_VALUE) return IntRange.EMPTY
    return this..(num - 1)
}