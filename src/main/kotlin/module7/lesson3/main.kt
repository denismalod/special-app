package module7.lesson3

fun main () {
    val renault = Car(descriptor = "Renault" to "Logan", color = "Brown")
//    println("Current speed - ${renault.currentSpeed}")
//    println("Current fuel - ${renault.fuelCount}")
//
//    renault.accelerate(100.0)
//    println("Current speed - ${renault.currentSpeed}")
//    println("Current fuel - ${renault.fuelCount}")
//
//    renault.decelerate(50.0)
//    println("Current speed - ${renault.currentSpeed}")
//    println("Current fuel - ${renault.fuelCount}")



    println("Current speed - ${renault.currentSpeed}")





}

fun printInfo(car: Car) {
    println("Brand - ${car.brand}, model - ${car.model}, color -  ${car.color}")
}