package module14.lesson6.part10

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import module14.lesson2.part1.Generator
import module14.lesson6.part9.StateGenerator

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

//    val shareFlow = (0..100).asFlow().shareIn()
//    val shareFlow = (0..100).asFlow().stateIn()

    val numbersFlow = Generator.flow.shareIn(scope = scope, SharingStarted.Eagerly,0)


}