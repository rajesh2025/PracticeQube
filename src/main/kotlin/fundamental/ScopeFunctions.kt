package fundamental

class ScopeFunctions {
}

fun main() {
    nullableString = "10"

    println(result)
    println(resultWith)
}
var  nullableString: String? = null
val result = nullableString?.let { str ->
    // Perform operations on the non-null receiver object
    str.length
}?.plus(10) // Chaining another function call

val resultWith = with(nullableString) {
    // Perform operations on the receiver object
    this?.length // Access properties or call methods
}?.plus(10) // Chaining another function call

