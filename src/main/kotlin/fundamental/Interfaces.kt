package fundamental

interface Interfaces {
    val property1: Int
    var property2: String
    fun markerFunction()

    fun nonmarkerFun(){
        println("non marker Function")
    }
}

fun main() {
    val interfaceObjct = object : Interfaces{
        override val property1: Int
            get() = TODO("Not yet implemented")
        override var property2: String
            get() = TODO("Not yet implemented")
            set(value) {}

        override fun markerFunction() {

        }

    }
    interfaceObjct.run { nonmarkerFun() }

}