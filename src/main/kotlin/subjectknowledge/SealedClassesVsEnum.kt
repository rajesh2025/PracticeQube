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

sealed class STATUS {
    object Error : STATUS()
    class SUCCESS : STATUS()
}

sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()
}

data class OutSealed(val status: STATUS) : Result()

fun main() {
    val sealobj = SubSeal1()
    sealobj.myFunc()

    SubSeal2.myFunc()

    val success = STATUS.SUCCESS()
    val error = STATUS.Error

    val pldrome = "madam"

    println("isPalindrome ${isPalimdrome(pldrome)}")
}

sealed interface Operation {
    fun execute(): Int

    sealed interface MyCustomOperation : Operation {
        fun reExecute()
    }
}

class Addition(val a: Int, val b: Int) : Operation {
    override fun execute(): Int = a + b
}

class Subtraction(val a: Int, val b: Int) : Operation, Operation.MyCustomOperation {
    override fun reExecute() {
        this.execute()
    }

    override fun execute(): Int = a - b
}

fun isPalimdrome(pldrome : String) : Boolean {
    val charArr = pldrome.toCharArray()
    for(i in charArr.indices){
      return charArr[i] == charArr[charArr.size-1]
    }
    return true
}
