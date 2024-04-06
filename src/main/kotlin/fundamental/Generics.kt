package fundamental


class Generics<T>(paraName: T) {
    private val name = paraName

    init {
        println("Name of the param $name")
    }

    fun <T> genericPrint(parameters: Generics<T>) {

    }
}

fun main() {
    val box: Generics<String> = Generics("kotlin")
    val circle: Generics<Int> = Generics(3)
    val box2 = Box(3)
    val myList: List<*> = ArrayList<Any>()

}

class Box<P>(p: P) {
    val value = p
}



