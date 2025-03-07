package basic

class Student private constructor(val name: String, val age: Int) {

//    constructor() : this("ramesh",34)

    companion object {
        fun createInstance(pair: Pair<String, Int>): Student {
            return Student(pair.first.uppercase(), pair.second)
        }
    }
}



fun main() {
//    val readStudent = Student()
//    println("${readStudent.name} ${readStudent.age}")

    val studentInstance = Student.createInstance(Pair( "rajesh",40))

    println("${studentInstance.name} ${studentInstance.age}")



}
