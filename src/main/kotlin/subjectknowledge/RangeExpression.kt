package subjectknowledge

val myLazy = lazy {
    EnumNum.Hello
}

val mylazy2 by lazy {
    EnumNum.Cello
}

fun main() {

    val rangecheck1 = 1..5 step 3

    println("Hello, Main!!")
    simpleCrossinline("Hello") {
        println(it)
        return@simpleCrossinline
    }
    println("Main finished")

    val mutableMap = mutableMapOf(1 to "Mahipal", 2 to "Nikhil", 3 to "Rahul")
    // we can modify the element
    mutableMap[1] = "Praveen"
    // add one more element in the list
    mutableMap[4] = "Abhi"
    for (item in mutableMap.values) {
        println(item)
    }
    println(mutableMap[2]?.let { it2 -> mutableMap[1]?.let { loginValidation(it, it2) } })
}

inline fun simpleCrossinline(str: String, crossinline func: (String) -> Unit) {
    func(str)
}

infix fun Int.doSum(num: Int): Int {
    return this + num
}

// nested function
fun loginValidation(username: String, password: String): Boolean {
    fun validateInput(value: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Should not be empty")
        }
    }
    validateInput(username)
    validateInput(password)
    myGeneric("ssudo")
    return true
}

fun <T> myGeneric(m: T) {

}

class HotelMllapi<H, N, M> {

    fun destroyHotel(forNew: M): M {
        return forNew
    }

    fun destroyH(forNew: N): N {
        return forNew
    }

    fun destroyHot(forNew: H): H {
        return forNew
    }
}