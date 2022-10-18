package module7.lesson3

import kotlin.random.Random

class Car(val brand: String, val model: String, val color: String = "White") {

    constructor(descriptor: Pair<String, String>, color: String) : this(
        brand = descriptor.first,
        model = descriptor.second,
        color = color
    ) {
        println("secondary constructor")
    }

    init {
        println("Car init")
    }

    var currentSpeed = 0.0
    get
    private set

//    get () {
//        println("current speed getter")
//        return field
//    }
//    set(value) {
//        field= value
//        println("current speed setter")
//    }
    private var fuelCount = 0.0

    init {
        println("second init")
    }

    fun accelerate(speed: Double) {
        val needFuel = speed * 0.1
        if (fuelCount>needFuel) {
            currentSpeed += speed
            useFuel(speed * 0.1)
        }
        else
            println("Car has not enough fuel")

    }

    fun decelerate(speed: Double) {
        currentSpeed = maxOf(0.0, currentSpeed -speed ) //вместо кода ниже
//        val finalSpeed = currentSpeed - speed
//        currentSpeed = if (finalSpeed<0) 0.0
//        else finalSpeed
//        currentSpeed -= speed
    }

    private fun useFuel(fuelCount: Double) {
        this.fuelCount -= fuelCount
    }

    fun move() {
        val distance = Random.nextInt(1, 10)
        println("Car passed $distance km")
    }

    fun start() {
        println(" Car started")
    }

    fun stop() {
        println(" Car stopped")
    }
}