package module14.lesson2.part3

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random

fun main() {
    runBlocking {
        launch {
            println("Start collecting...")
            var counter = 0
            Generator.flow().collect {
                println("Collected value - $it")
                counter++
                if(counter>=10)
                    cancel()
                delay(200)

            }
        }
        println("Start working...")
    }

}

object Generator {
    val flow = flow {
        while (currentCoroutineContext().isActive) {
            emit(Random.nextInt())
            delay(1000)
        }
    }

    fun flow(): Flow<Int> {
        return (0..100).asFlow()

    }
}