package module14.lesson3.part3

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import module14.lesson3.part2.square
import kotlin.random.Random

fun main() {
    runBlocking {
        launch{
            distinctFlow
                .distinctUntilChanged ()
                .collect { println(it) }
        }
    }
}

val intermediateFlow = (0..10)
    .asFlow()
    .square()
    .filter { it % 2 == 0 }
    .take(3)

fun Flow<Int>.square(): Flow<Int> = transform { value ->
    return@transform emit(value * value)
}

val distinctFlow = flow {
    repeat (10) {
        emit(Random.nextBoolean())
            delay(500)
    }
}