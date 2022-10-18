package module11.lesson1

import module7.lesson1.Car

fun main() {
    val car1 = Car()
    val car2 = Car()
    val car3 = car1

    println(car1===car3)
    println(car1===car2)

    println(
        Person(
            name = "Name",
            lastName = "LastName",
            passportSeries =  9999,
            passportNumber = 999999
        )
    )


}