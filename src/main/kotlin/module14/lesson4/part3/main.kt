package module14.lesson4.part3

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    val nums = (1..3).asFlow().onEach { delay(1000) }
    val strs = flowOf("one","two","three").onEach {delay (2000)}
    runBlocking {
        launch{
            nums
                .combine(strs) {number, string -> Result(number, string)}
                .collect{println(it)}
        }
    }
}

class Result(val number: Int, val str: String)