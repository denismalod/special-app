package module12

import kotlin.random.Random

fun main() {
    val list = List<Int>(5) { Random.nextInt() }
    val item = runCatching { list[6] }

    println(item.isFailure)
    println(item.isSuccess)
    println(item.getOrNull())   //получить объект, если код внутри runCatching возвращает значение
    println(item.exceptionOrNull()) // получить сам объект иключения


}