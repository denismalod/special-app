package module8.practicalWork7

import kotlin.random.Random

open class Animal(
    var energy: Int,
    var weight: Int,
    var curAge: Int,
    val maxAge: Int,
    val name: String
) {

    private fun isTooOld(): Boolean {
        return curAge >= maxAge
    }

    var move = false
    open fun walk() {
        val checkEnergy = energy - 5
        val checkWeight = weight - 1
        move = false
        if (!isTooOld() || (checkEnergy > 0) || (checkWeight > 0)) {
            energy = checkEnergy
            weight = checkWeight
            tryIncrementAge()
            println("$name передвигается")
            move = true
        }
    }

    fun eat() {
        energy += 3
        weight++
        tryIncrementAge()
        println("$name ест")
    }

    fun sleep() {
        energy += 5
        tryIncrementAge()
        println("$name спит")
    }

    private fun tryIncrementAge() {
        if (Random.nextBoolean()) curAge++
    }

    open fun birth(): Animal {
        val newBorn = Animal(Random.nextInt(1, 10), Random.nextInt(1, 5), 0, maxAge, name)
        println(
            "Рождено животное - ${newBorn.name}, энергии ${newBorn.energy}, " +
                    "вес ${newBorn.weight}, возраст ${newBorn.curAge}, максимальный возраст ${newBorn.maxAge} "
        )
        return newBorn
    }
}


