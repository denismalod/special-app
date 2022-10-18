package module14.lesson6.part4

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.take
import kotlin.random.Random

fun main() {
    runBlocking {
        launch {
            GeneratorShared.sharedFlow.take(3).collect {
                println(it)
            }
        }

    }


}

object GeneratorShared {
    private val scope = CoroutineScope(Job() + Dispatchers.Default)
    private val _sharedFlow = MutableSharedFlow<Int>()
    val sharedFlow = _sharedFlow.asSharedFlow()

    init {
        scope.launch {
            repeat(10) {
                _sharedFlow.emit(Random.nextInt(90, 101))
                delay(500)
            }
        }
    }
}