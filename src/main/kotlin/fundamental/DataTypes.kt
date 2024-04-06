package fundamental

class DataTypes{
    val printCmd = {
        val list = listOf<Number>(1, 36.toDouble(), 645.toFloat(), 30.toShort(), 4334340.toLong()  )
        println(list)
    }
}

fun main() {
    DataTypes().printCmd.invoke()
}