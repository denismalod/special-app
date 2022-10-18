package module10.lesson4

import kotlin.random.Random

fun main() {
//    val train = Train(1000)
//    println("capacity - ${train.capacity}")
//    train.move()

    val boeing737 = Boeing737()
    fillAircraft(boeing737)
    println(boeing737.getInfo())
    boeing737.getSeatScheme()
    printPassengerInfo(boeing737, Seat(0, 'C'))

    printPassengerInfo(boeing737, Seat(3, 'A'))
    printPassengerInfo(boeing737, Seat(25, 'D'))
    printPassengerInfo(boeing737, Seat(10, 'E'))


    println("=============================")

    val zeppelin = Zeppelin()
    fillAircraft(zeppelin)
    println(zeppelin.getInfo())
    zeppelin.getSeatScheme()
    printPassengerInfo(zeppelin, Seat(0, 'C'))

}


fun printPassengerInfo(aircraft: Aircraft, seat: Seat) {
    aircraft.getPassenger(seat)
        ?.getInfo()
        ?.let { println(it) }
        ?: println("there is no passenger")
}

fun fillAircraft(aircraft: Aircraft) {
    val zeppelinPassengers = Random.nextInt(1, aircraft.capacity)
    for (i in 0 until zeppelinPassengers) {
        val seat = aircraft.getAvailableSeat() ?: return

        val passenger = Passenger(
            name = "Ivan",
            lastName = "Petrov",
            document = getDocument(aircraft),
            seat = seat
        )
        aircraft.addPassenger(passenger)
    }
}

fun getDocument(aircraft: Aircraft): Document =
    if (aircraft is Zeppelin)
        DeputyID(
            number = Random.nextInt(100000, 999999).toString(),
            issuedDate = "19.02.2021"
        )
    else ForeignPassport(
        series = Random.nextInt(1000, 9000).toString(),
        number = Random.nextInt(100000, 999999).toString()
    )

fun getRandomDocument(): Document =
    when (Random.nextInt(0, 2)) {
        0 -> ForeignPassport(
            series = Random.nextInt(1000, 9000).toString(),
            number = Random.nextInt(100000, 999999).toString()
        )
        else -> DeputyID(
            number = Random.nextInt(100000, 999999).toString(),
            issuedDate = "19.02.2021"
        )

    }