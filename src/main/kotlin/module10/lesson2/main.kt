package module10.lesson2

import kotlin.random.Random

fun main() {
//    val train = Train(1000)
//    println("capacity - ${train.capacity}")
//    train.move()

    val boeing737 = createAndFillBoeing()
    println(boeing737.getInfo())
    boeing737.getSeatScheme()
    boeing737.getPassenger(Seat(0,'c'))
        ?.getInfo()
        ?.let {println(it)}
        ?: println("there is no passenger")


    println("=============================")

    val zeppelin = createAndFillZeppelin()
    println(zeppelin.getInfo())
    zeppelin.getSeatScheme()
    zeppelin.getPassenger(Seat(0,'c'))
        ?.getInfo()
        ?.let {println(it)}
        ?: println("there is no passenger")

}

fun createAndFillBoeing(): Boeing737 {
    val boeing737 = Boeing737()
    val passengersCount = Random.nextInt(1, boeing737.capacity)
    for (i in 0 until passengersCount) {
        val seat = boeing737.getAvailableSeat() ?: return boeing737

        val passenger = Passenger(
            name = "Ivan",
            lastName = "Petrov",
            document = ForeignPassport(
                series = Random.nextInt(1000,9000).toString(),
                number = Random.nextInt(100000,999999).toString(),
            ),
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
            document = DeputyID(
                number = Random.nextInt(100000,999999).toString(), "19.02.2021"
            ),
            seat = seat
        )
        zeppelin.addPassenger(passenger)
    }
    return zeppelin
}