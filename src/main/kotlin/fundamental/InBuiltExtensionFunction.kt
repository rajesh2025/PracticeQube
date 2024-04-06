package fundamental

import kotlinx.coroutines.flow.combineTransform


class InBuiltExtensionFunction {
    class Order(val lines: List<OrderLine>)

    class OrderLine(val name: String, val price: Int)

}

fun main() {
     val order = InBuiltExtensionFunction.Order(
        listOf(
            InBuiltExtensionFunction.OrderLine("Tomato", 2),
            InBuiltExtensionFunction.OrderLine("Garlic", 3),
            InBuiltExtensionFunction.OrderLine("Chives", 2)
        )
    )
    val names = order.lines.map { it.name }
    val prices = order.lines.map { it.price }

    val totalPrice = order.lines.sumOf { it.price }
    println(names)
    println("-------------------------")
    println(prices)
    println("-------------------------")
    println(totalPrice )

    val orders = listOf(
        InBuiltExtensionFunction.Order(
            listOf(
                InBuiltExtensionFunction.OrderLine("Garlic", 3),
                InBuiltExtensionFunction.OrderLine("Chivas", 2)
            )
        ),
        InBuiltExtensionFunction.Order(
            listOf(
                InBuiltExtensionFunction.OrderLine("Tomato", 1),
                InBuiltExtensionFunction.OrderLine("Garlic", 2)
            )
        ),
        InBuiltExtensionFunction.Order(
            listOf(
                InBuiltExtensionFunction.OrderLine("Potato", 1),
                InBuiltExtensionFunction.OrderLine("Chives", 2)
            )
        )
    )

    val lines = orders.flatMap { it.lines }
    val flatNames = lines.map { it.name }.distinct()
    println(lines)
    println("-------------------------")
    println(flatNames )


    val myOrder = InBuiltExtensionFunction.Order(
        listOf(
           InBuiltExtensionFunction.OrderLine("Milk",45),
           InBuiltExtensionFunction.OrderLine("Butter",60),
    ))

    val myOrderItemsNames = myOrder.lines.map { it.name }

    println("myOrderItemsNames $myOrderItemsNames")
    println("-------------------------")
    println("myOrder totalPrice ${myOrder.lines.sumOf { it.price }}" )


    val listOfOrders = listOf(
        InBuiltExtensionFunction.Order(
            listOf(
                InBuiltExtensionFunction.OrderLine("Tomato", 31),
                InBuiltExtensionFunction.OrderLine("Garlic", 22)
            )
        ),
        InBuiltExtensionFunction.Order(
            listOf(
                InBuiltExtensionFunction.OrderLine("Potato", 51),
                InBuiltExtensionFunction.OrderLine("Chives", 72)
            )
        )
    )
//   val myOrderNamesList =  listOfOrders.map { it.lines }

    println(listOfOrders.flatMap { it.lines })
}
