package module12

import kotlin.random.Random

fun main() {
    val numbers = Numbers(10)
    printNumber(numbers.getNumberByIndex(20))
}

fun printNumber(number: Int) {
    println("number - $number")
}

class Numbers(n: Int) {
    private val numbers = List(n) {Random.nextInt()}
    fun getNumberByIndex(index: Int) = numbers[index]

}