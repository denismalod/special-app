package module13.lesson3

import java.math.BigInteger
import kotlin.concurrent.thread
import kotlin.random.Random
import kotlin.random.asJavaRandom
import kotlin.system.measureTimeMillis


fun main() {
    println("Program star: ${Thread.currentThread().name}")
    magicNumber(object : Callback {
        override fun onSuccess(value: BigInteger) {
            println("first number = $value")
        }

        override fun onFailure(error: Throwable) {
            println("Error occurred: ${error.message}")
        }
    })
    magicNumber(object : Callback {
        override fun onSuccess(value: BigInteger) {
            println("second number = $value")
        }

        override fun onFailure(error: Throwable) {
            println("Error occurred: ${error.message}")
        }
    })


}

fun magicNumber(callback: Callback) {
    thread {
        println("Calculation start: ${Thread.currentThread().name}")
        val number: BigInteger
        val time = measureTimeMillis {
            number = BigInteger.probablePrime(4000, Random.asJavaRandom())
        }
        if (time > 2000)
            callback.onFailure(Throwable("Calculation was too long"))
        else
            callback.onSuccess(number)

    }
}

interface Callback {
    fun onSuccess(value: BigInteger)
    fun onFailure(error: Throwable)
}