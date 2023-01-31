package subjectknowledge

data class SimpleClass(val _name:String) {
//val zeroZero = "26"
    lateinit var name : String

    var hello : String = _name
        set(value) {
            field = "$field $value Goswami"
            name = field
        }
        get() = "$field Ram Ram"


}

fun main() {
    println(SimpleClass("dada") to String())
}
