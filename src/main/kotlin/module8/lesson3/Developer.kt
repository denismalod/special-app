package module8.lesson3

import kotlin.random.Random

open class Developer(
    name: String,
    age: Int,
    protected val experience: Int = 5
) : Person(name, age) {
    open val paradigm = "OOP"
    open fun writeCode() = println("programmer writing code")
    open fun getLevel() = when (experience) {
        0 -> "intern"
        in 1..2 -> "middle"
        in 3..4 -> "senior"
        else -> "leading"
    }

    protected open fun getCoffeeBreak() = Random.nextBoolean()
}