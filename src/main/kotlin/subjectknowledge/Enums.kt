package subjectknowledge

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

enum class DAYS : BinaryOperator<Int>, IntBinaryOperator {

    Sunday {
        override fun signal() {}
        override fun applyAsInt(p0: Int, p1: Int): Int {
          return  p0 + p1
        }

        override fun apply(p0: Int, p1: Int): Int {
            return  p0 + p1
        }

        fun myMethod() {
            println("SUnday is funday")
        }
    },
    Monday {
        override fun signal() {
            
        }

        override fun applyAsInt(p0: Int, p1: Int): Int {
            return  p0 + p1
        }

        override fun apply(p0: Int, p1: Int): Int {
            return  p0 + p1
        }

        fun myMethod() {
            println("Monday is not funday")
        }
    },
    Tuesday {
        override fun signal() {
            
        }

        override fun applyAsInt(p0: Int, p1: Int): Int {
            return  p0 + p1
        }

        override fun apply(p0: Int, p1: Int): Int {
            return  p0 + p1
        }

        fun myMethod() {

        }
    },
    Wednesday {
        override fun signal() {
            
        }

        override fun applyAsInt(p0: Int, p1: Int): Int {
            return  p0 + p1
        }

        override fun apply(p0: Int, p1: Int): Int {
            return  p0 + p1
        }

        fun myMethod() {

        }
    },
    Thursday {
        override fun signal() {
            
        }

        override fun applyAsInt(p0: Int, p1: Int): Int {
            return  p0 + p1
        }

        override fun apply(p0: Int, p1: Int): Int {
            return  p0 + p1
        }
    },
    Friday {
        override fun signal() {
            
        }

        override fun applyAsInt(p0: Int, p1: Int): Int {
            return  p0 + p1
        }

        override fun apply(p0: Int, p1: Int): Int {
            return  p0 + p1
        }
    },
    Saturday {
        override fun signal() {
            
        }

        override fun applyAsInt(p0: Int, p1: Int): Int {
            return  p0 + p1
        }

        override fun apply(p0: Int, p1: Int): Int {
            return  p0 + p1
        }
    };

    abstract fun signal()
}


/////////
enum class RGB { RED, GREEN, BLUE }

inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
}
fun main() {
    //println(DAYS.values().forEach { println("${it.ordinal} = ${it.name}") })
    printAllValues<RGB>()

    var st = 1
    var  st2= 4
    st2 = st
//    var final  = 1+ (st = st2)
    
}