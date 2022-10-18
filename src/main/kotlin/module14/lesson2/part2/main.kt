package module14.lesson2.part2

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random

fun main() {
    runBlocking {
        launch {
            println("Start collecting...")
            Generator.flow().collect {
                println("Collected value - $it")
                delay(2000)

            }
        }
        println("Start working...")
    }

}

object Generator {
//    val flow = flow {
//        while (currentCoroutineContext().isActive) {
//            emit(Random.nextInt())
//            delay(1000)
//        }
//    }

    fun flow(): Flow<Int> {
        return (0..100).asFlow()

    }
}