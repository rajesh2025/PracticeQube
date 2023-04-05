package subjectknowledge

class SealedClassesVsEnum {
}

sealed class SeelClass {

}

 class SubSeal1 : SeelClass() {
    fun myFunc() {
        println("subSeal1")
    }
}

object SubSeal2 : SeelClass() {
    fun myFunc() {
        println("subSeal2")
    }
}

enum class EnumNum(int: Int) {
    Hello(1),
    Cello(2),
    Fellow(3),
    Trello(4),
    Mellow(5)
}

sealed class STATUS{
    object Error: STATUS()
    class SUCCESS:STATUS()
}

fun main() {
val sealobj = SubSeal1()
    sealobj.myFunc()

    SubSeal2.myFunc()

    val success = STATUS.SUCCESS()
    val error = STATUS.Error
}