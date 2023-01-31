package subjectknowledge

class InnerClassesAndInterface {
    interface OuterInterface {
        class InnerClass
        interface InnerInterface
    }

    class OuterClass {
        class InnerClass
        interface InnerInterface{
            companion object{
                val hello = "Rajesh Goswami"
            }
        }
    }

    class Outer {
        private val bar: Int = 1
        inner class Inner {
            fun foo() = bar
        }
    }

    val demo = Outer().Inner().foo() // == 1
}

fun main() {

//    println(InnerClassesAndInterface.OuterClass.InnerInterface)
//    println(InnerClassesAndInterface.OuterClass.InnerInterface.hello)
//    println(InnerClassesAndInterface.OuterClass.InnerClass())
//
//    println(InnerClassesAndInterface.OuterInterface.InnerClass())
//    println(object :InnerClassesAndInterface.OuterInterface.InnerInterface{
//    })
}