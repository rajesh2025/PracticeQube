package fundamental

fun main() {
//    val outer = Outer()
//    val inner = Outer.Inner()
//
//    inner.printOuterProperty(outer)

//    InitOrderDemo("Classes in Kotlin")

    val aImpl = AImpl()
    val bImpl = BImpl()
    val obj = MyClass(aImpl, bImpl)
    obj.methodA() // Output: Method A
    obj.methodB() // Output: Method B

    // Interface with same function calling
    val interfaceImpl = InterfaceWithSameMethod()
    interfaceImpl.methodAB()
    print(interfaceImpl)
}

class Outer {
    private val outerProperty = "Outer Property"

    class Inner {
        fun printOuterProperty(outer: Outer) {
            println("Outer property: ${outer.outerProperty}")
        }
    }
}


class InitOrderDemo(name: String) {
    val firstProperty = "First property : $name".also(::println)

    init {
        println("third block which print$name")
    }

    init {
        println("second block which print$name")
    }

    init {
        println("first block which print$name")
    }
}

interface A {
    fun methodA()
}

class AImpl : A {
    override fun methodA() {
        println("Method A")
    }
}

interface B {
    fun methodB()
}

class BImpl : B {
    override fun methodB() {
        println("Method B")
    }
}

class MyClass(a: A, b: B) : A by a, B by b

interface InterfaceOne {
    fun methodAB() {
        println(" interface called from InterfaceOne $this")
    }
}

interface InterfaceTwo {
    fun methodAB() {
        println(" interface called from InterfaceTwo $this")
    }
}

class InterfaceWithSameMethod : InterfaceOne, InterfaceTwo {
    override fun methodAB() {
        super<InterfaceOne>.methodAB()
        super<InterfaceTwo>.methodAB()
        println(" ${this.javaClass.simpleName} ${this.javaClass.enclosingMethod.name}")
    }

}


object SharingWidget {
    private var twitterLikes = 0
    private var fbLikes = 0
    fun incrementTwitterLikes() = twitterLikes++
    fun incrementFBLikes() = fbLikes++
    fun display() = println("Facebook - $fbLikes --Twitter - $twitterLikes")
}
