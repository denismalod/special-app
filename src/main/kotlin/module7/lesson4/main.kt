package module7.lesson4

fun main() {
//    println("Height - ${EiffelTower.height}")
//    EiffelTower.turnOnBacklights()
//    EiffelTower.turnOffBacklights()

    val tower1 = EiffelTower
    val tower2 = EiffelTower

    println("tower1 backlights on? - ${tower1.backlightsOn}")
    println("tower2 backlights on? - ${tower2.backlightsOn}")

    tower1.turnOnBacklights()

    println("tower1 backlights on? - ${tower1.backlightsOn}")
    println("tower2 backlights on? - ${tower2.backlightsOn}")

    println("Wheels count - ${Car.wheelsCount}")
    val classType = Car.getCarClass( 3.8)
    println(classType)
//    println(Car.getCarClass( 3.8))

//    val car = Car("Audi", "A3")
//    car.getCarClass
}