package module13.practical_work_12

fun main() {

    var n = 0

    while (n <= 0) {
        println("Введите n > 0: ")
        val checkNull = readLine()?.toIntOrNull()
        if ((checkNull == null) || (checkNull <= 0)) {
            println("Некорректное число")
            continue
        } else
            n = checkNull

    }
    println("Для n = $n число Фибоначчи F = ${fibonacci(n)}")


}


fun fibonacci(n: Int): Long {
    var result: Long = 0
    var fibo1: Long = 0
    var fibo2: Long = 1

    when (n) {
        1 -> result = 0
        2 -> result = 1
        else -> {
            var i = 3
            while (i <= n) {
                result = fibo1 + fibo2
                fibo1 = fibo2
                fibo2 = result
                i++
            }
        }
    }
    return result
}