package module14.lesson3

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
    .map { it * it }
    .filter { it % 2 == 0 }
    .take(3)

