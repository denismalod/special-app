package module14.lesson2.part1

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random

fun main() {
    runBlocking {
        launch {
            println("Start collecting...")
            Generator.flow.collect {
                println("Collected value - $it")

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
        return flow {
            while (currentCoroutineContext().isActive) {
                emit(Random.nextInt())
                delay(1000)
            }
        }
    }
}