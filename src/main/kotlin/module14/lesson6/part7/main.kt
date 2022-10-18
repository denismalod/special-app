package module14.lesson6.part7

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import module14.lesson6.part8.Numbers
import kotlin.random.Random

fun main() {
    val numbers = Numbers()
    runBlocking {
        launch {
            delay(2000)
            numbers.sharedFlow.collect {
                println(it)
            }
        }

    }


}

class Numbers {
    private val scope = CoroutineScope(Job() + Dispatchers.Default)
    private val _sharedFlow = MutableSharedFlow<Int>(replay = 3)
    val sharedFlow = _sharedFlow.asSharedFlow()

    init {
        scope.launch {
            for (i in 1..10) {
                _sharedFlow.emit(i)
                delay(500)
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
            _sharedFlow.emit(100)
        }
    }
}