package module7.lesson1

import kotlin.random.Random

class Car {
    val brand = "Audi"
    val model ="A3"
    val color = "Red"

    fun move() {
        val distance = Random.nextInt(1,10)
        println("Car passed $distance km")
    }

    fun start () {
        println(" Car started")
    }

    fun stop () {
        println(" Car stopped")
    }
}