package module13.lesson6.part10

import kotlinx.coroutines.*

val exceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
    println("error from handler - ${throwable.message}")
}


val scope = CoroutineScope(Job() + Dispatchers.Default+ exceptionHandler)

suspend fun main() {
    val job = scope.launch {
        var i =0
        while (true) {
            println(i++)
            //Thread.sleep(500)
            delay(500)
        }
    }

    scope.launch {
        delay(3000)
        println("cancel job")
        job.cancel()
    }

    (scope.coroutineContext.job as? CompletableJob)?.let {
        it.complete()
        it.join()
    } ?: throw IllegalStateException()
}