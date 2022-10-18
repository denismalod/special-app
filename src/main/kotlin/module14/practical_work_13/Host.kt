package module14.practical_work_13

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow


import kotlin.random.Random
import kotlin.random.nextInt

object Host {
    var allNumbers = mutableListOf<Int>()
    private val scope = CoroutineScope(Job() + Dispatchers.Default)
    private val _sharedFlow = MutableSharedFlow<Int>(replay = 5)
    val sharedFlow = _sharedFlow.asSharedFlow()
    var stopPlay = 1
    var count = 0

    init {

        scope.launch {
            for (i in 1..90) {
                _sharedFlow.emit(getNumber())
                delay(50)
            }
        }
    }

    private fun getNumber(): Int {
        var num: Int
        while (true) {
            var checkNum = true
            num = Random.nextInt(1..90)
            allNumbers.forEach {
                if (it == num) checkNum = false
            }
            if (checkNum) break
        }
        num *= stopPlay
        allNumbers.add(num)
        count ++
        if (num < 91) print("$num\t")
        if (count%20 == 0) println()

        return num
    }
}