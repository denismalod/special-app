package module7.lesson2

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

    var currentSpeed =0.0

    init {
        println("second init")
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