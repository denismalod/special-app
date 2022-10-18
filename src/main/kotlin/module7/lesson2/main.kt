package module7.lesson2

fun main () {
//    val vw = Car(brand = "VW", model="Beetle", color = "Green")
//    val lada = Car(brand = "Lada", model="vesta", color = "Yellow")
//    val bmv = Car(brand = "BMV", model="X6")
//
//    printInfo(vw)
//    printInfo(lada)
//    printInfo(bmv)

    val vw = Car(brand = "VW", model="Beetle", color = "Green")
    val renault = Car(descriptor = "Renault" to "Logan", color = "Brown")

//    printInfo(vw)
//    printInfo(renault)


//    println("Auto info")
//    println("${auto.brand} ${auto.model} ${auto.color} color ")
//
//    auto.start()
//    auto.move()
//    auto.move()
//    auto.move()
//    auto.move()
//    auto.move()
//    auto.stop()

}

fun printInfo(car: Car) {
    println("Brand - ${car.brand}, model - ${car.model}, color -  ${car.color}")
}