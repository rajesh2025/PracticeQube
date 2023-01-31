package subjectknowledge

// data classes
data class Claz(var param: String) {
    var height: Int = 0


}

interface NewInterface {

}

const val srt = ""
val tryVal = "goodTry"

data class User(val name: String, val age: Int)

fun main() {
    val person = Person("First name", 32)

    val userLam = User(name = "raju chacha", age = 19)
    val olderLam = userLam.copy(age = 23)

    val (name, aage) = userLam
    val (oName, oAge) = olderLam
    println("$name $aage ${userLam.hashCode()}")
    println("$oAge" + " $oName ${olderLam.hashCode()}")


}

fun heloCheck() {

}

//const val foo = heloCheck()   //Not okay
val fooVal = heloCheck()      //Okay

const val bar = "Hello world"           //Also okay