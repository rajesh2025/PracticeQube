package subjectknowledge

import javax.annotation.processing.Completion
import kotlin.coroutines.CoroutineContext


fun main(args: Array<String>) {
    val person = Person()
    with(person) {
        name = "rajesh"
        age = 31
    }

    person.apply {
        name = "deeksha"
        age = 24
    }.startRun()

}
 data class Person(var name: String = "", var age: Int = -1) {
    fun startRun() {
        println("Now i am ready to run")

        class NameName:SameNameTwo("hello hello"){

        }
    }
    suspend fun trySuspending() = run{
        trySuspendingTwo()
        println("rajesh rajesh")
    }
    suspend fun trySuspendingTwo() = run{
        println("hsejar")
    }

}