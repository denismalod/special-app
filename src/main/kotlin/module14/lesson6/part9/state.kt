package module14.lesson6.part9

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import module14.lesson6.part10.StateGenerator

fun main() {
    val generator = StateGenerator()

    generator.square(10)

    generator.squareSuspend(30)
    generator.squareSuspend(20)

    runBlocking {
        launch {
            generator.stateFlow.collect {
                println(it)
            }
        }
    }

}

class StateGenerator {
    private val scope = CoroutineScope(Job() + Dispatchers.Default)
    private val _stateFlow = MutableStateFlow(10)
    val stateFlow = _stateFlow.asStateFlow()

    fun square(value: Int) {
        _stateFlow.value = value * value
    }

    fun squareSuspend(value: Int) {
        scope.launch {
            delay(1000)
            _stateFlow.value = value * value
        }
    }


}