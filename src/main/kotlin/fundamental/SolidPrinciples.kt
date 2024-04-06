package fundamental

class SolidPrinciples {
}

class SingleResponsibility {

}

interface Vehicle {
    fun getCarWidth()
}

 class Car : Vehicle {
    fun getFloorWidth() {
    }

    override fun getCarWidth() {

    }
}

class RacingCar : Vehicle {
    override fun getCarWidth() {

    }
    fun getCockpitWidth() {

    }
}

fun main() {

}