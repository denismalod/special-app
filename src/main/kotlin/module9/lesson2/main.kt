package module9.lesson2

import kotlin.random.Random

fun main() {
//    val train = Train(1000)
//    println("capacity - ${train.capacity}")
//    train.move()

    val boeing737 = createAndFillBoeing()
    println(boeing737.getInfo())
    boeing737.getSeatScheme()

    println("=============================")

    val zeppelin = createAndFillZeppelin()
    println(zeppelin.getInfo())
    zeppelin.getSeatScheme()

}

fun createAndFillBoeing(): Boeing737 {
    val boeing737 = Boeing737()
    val passengersCount = Random.nextInt(1, boeing737.capacity)
    for (i in 0 until passengersCount) {
        val seat = boeing737.getAvailableSeat() ?: return boeing737

        val passenger = Passenger(
            name = "Ivan",
            lastName = "Petrov",
            passport = "${Random.nextInt(1000,9999)} ${Random.nextInt(100000,999999)}",
            seat = seat
        )
        boeing737.addPassenger(passenger)
    }
    return boeing737
}

fun createAndFillZeppelin(): Zeppelin {
    val zeppelin = Zeppelin()
    val zeppelinPassengers = Random.nextInt(1, zeppelin.capacity)
    for (i in 0 until zeppelinPassengers) {
        val seat = zeppelin.getAvailableSeat() ?: return zeppelin

        val passenger = Passenger(
            name = "Ivan",
            lastName = "Petrov",
            passport = "${Random.nextInt(1000,9999)} ${Random.nextInt(100000,999999)}",
            seat = seat
        )
        zeppelin.addPassenger(passenger)
    }
    return zeppelin
}