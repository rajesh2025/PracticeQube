package coroutines

import com.sun.jdi.Value
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ObsoleteCoroutinesApi
import kotlinx.coroutines.newSingleThreadContext
import org.junit.Before
import java.sql.DriverManager.println

class CoroutineTest {
    @OptIn(ObsoleteCoroutinesApi::class)
    private val mainThreadSurrogate = newSingleThreadContext("UI Thread")


    @Before
    fun setUp() {

    }


}

inline fun <reified T> displayValue(value: T): Unit {
//    println(value)
//    println("Type of T: ${T::class.java}")
//    return when (T::class) {
//        String::class -> {
//            "" as T
//        }
//
//        else -> {
//
//        }
//    }
}


fun main() {
    displayValue("String value")
    displayValue(10)
}

