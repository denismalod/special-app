package module14.lesson3.part2

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch{
            intermediateFlow.collect {
                println(it)
            }
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