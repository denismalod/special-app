package module13.practical_work_12

import kotlinx.coroutines.*
import module13.lesson6.part13.scope
import module13.practical_work_12.Fibonacci.take
import java.math.BigInteger


var parentJob = Job()
val scope = CoroutineScope(parentJob + Dispatchers.Default)



suspend fun main() {

    runBlocking {
        launch { take(5) }
        launch { take(10) }
        launch { take(15) }
        launch { take(12) }
        launch { take(11) }
        launch { take(6) }
    }


    // Отмена корутины с помощью функции yield()
    val job = scope.launch { take(40) }

    scope.launch {
        delay(1000)
        println("Cancel job")
        job.cancel()
    }


    //Отмена корутины с помощью функции withTimeout
    runBlocking {
        try {
            withTimeout(3000) {
                launch { take(150) }
            }
        } catch (e: Exception) {
            println("Время вычисления превышено")
        }
    }


    //вывод точек в консоль

    val job2 = scope.launch {
                printDots()
    }

    val job3 = scope.launch {
        launch { take(12) }
        launch { take(50) }
        launch { take(15) }
        launch { take(16) }
    }
    job3.join()
    println("job done")
    job2.cancel()





    (scope.coroutineContext.job as? CompletableJob)?.let {
        it.complete()
        it.join()
    } ?: throw IllegalStateException()


}


object Fibonacci {

    fun Int.toBigInteger(): BigInteger = BigInteger.valueOf(toLong())


    suspend fun take(number: Int): BigInteger {
        val n: Int = number
        var result = 0.toBigInteger()
        var fibo1 = 0.toBigInteger()
        var fibo2 = 1.toBigInteger()


        when (n) {
            1 -> result = 0.toBigInteger()
            2 -> result = 1.toBigInteger()
            else -> {
                var i = 3
                while (i <= n) {
                    yield()
                    result = fibo1 + fibo2
                    fibo1 = fibo2
                    fibo2 = result
                    i++
                    delay(50)
                }
            }
        }

        println("Для n = $n число Фибоначчи F = $result")
        return result
    }
}

suspend fun printDots() {
    var i: Int = 0
    while (true) {
        yield()
        i++
        delay(10)
        if (i % 100 == 0)
            println(".")
        else print(".")
    }
}