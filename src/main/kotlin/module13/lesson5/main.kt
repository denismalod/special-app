package module13.lesson5

import kotlinx.coroutines.*
import module13.lesson3.Callback
import module13.lesson3.magicNumber
import java.math.BigInteger
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

fun main() {

    runBlocking {
        launch {
            println("Start runBlocking...")
            suspendMagicNumbers()
            println("Finish runBlocking")
        }

    }



}

suspend fun doSomeWork() {
    println("Start work...")
    delay(3000)
    println("Finish work...")
}

suspend fun suspendMagicNumbers() {
    suspendCoroutine<BigInteger> { continuation ->
        magicNumber(object : Callback{
            override fun onSuccess(value: BigInteger) {
               println("number $value")
                continuation.resume(value)
            }

            override fun onFailure(error: Throwable) {
                println("error ${error.message}")
                continuation.resumeWithException(error)
            }
        })

    }
}