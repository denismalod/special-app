package module12

import kotlin.random.Random

fun main() {
    val list = List<Int>(5) { Random.nextInt() }
    try {
        for (i in list.indices)
            println(list[i])
        println("end of program")
    } catch (e: IndexOutOfBoundsException) {
        println("there is no such index")
    } catch (e: NullPointerException) {
        println("null pointer")
    } catch (t: Throwable) {                       //этот блок покрывает все возможные исключения
        println("basic throwable")
    } finally {
        println("finally block")
    }
}