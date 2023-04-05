package subjectknowledge

//interface KotlinInterface {
//    fun declareMust(){
//        println("concrete function inside interface")
//    }
//    fun mapInterface()
//}
//
//class InterfaceExtend : KotlinInterface{
//    //    override fun declareMust() {
////        println("overridden interface concrete function ")
////    }
//    override fun mapInterface() {
//    }
//}
//
//interface A {
//    fun foo() { print("A") }
//    fun bar()
//}
//
//interface B {
//    fun foo() { print("B") }
//    fun bar() { print("bar") }
//}
//
//class C : A {
//    override fun bar() { print("bar") }
//}
//
//class D : A, B {
//    override fun foo() {
//        super<A>.foo()
//        super<B>.foo()
//    }
//
//    override fun bar() {
//        super<B>.bar()
//    }
//}

fun main(args: Array<String>) {
//    val objectMade = D()
//    with(objectMade){
//        this.foo()
//        this.bar()
//    }

    val b = BaseImpl(10)
    Derived(b).print()
}

//
interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

class Derived(c: Base) : Base by c

