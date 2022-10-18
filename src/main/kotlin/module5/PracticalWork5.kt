package module5

import kotlin.random.Random

fun main() {

    var n = 0

    while (n <= 0) {
        println("Введите N > 0: ")
        val checkNull = readLine()?.toIntOrNull()
        if ((checkNull == null) || (checkNull <= 0)) {
            println("Некорректное число")
            continue
        } else
            n = checkNull

    }

    val numbers = List<Int>(n) { Random.nextInt(-5, 5) }
    val newNumbers = numbers.toMutableList()
    println("Исходный список $numbers")

    newNumbers.forEachIndexed { index, item ->
        run {
            if (item % 2 == 0)
                newNumbers[index] = item * 10
        }
    }

    println("Чётные элементы умножены на 10: $newNumbers")

    println("Сумма всех элементов списка: ${newNumbers.sumOf { it }}")

    println("Положительные элементы списка: ${newNumbers.filter { it > 0 }}")


   println()
    n = 0
    while (n <= 0) {
        println("Введите количество пользователей: ")
        val checkNull = readLine()?.toIntOrNull()
        if ((checkNull == null) || (checkNull <= 0)) {
            println("Некорректное число")
            continue
        } else
            n = checkNull

    }

    val logPas = HashMap<String, String>(n-1)
    var login: String
    var password: String

    for (i in 0 until n) {
        println("Введите логин ${i + 1} пользователя: ")
        login = readLine().toString()
        println("Введите пароля ${i + 1} пользователя: ")
        password = readLine().toString()
        logPas[login] = password

    }
    println("Подготовка данных закончена!")
    println(logPas)

    println("Авторизация пользователей:")

    while (true) {
        println("Введите логин: ")
        login = readLine().toString()
        println("Введите пароль: ")
        password = readLine().toString()
        if (logPas.keys.contains(login)) {
              if (logPas[login]==password)
                break
        }
        println("Указан неверный логин или пароль")

    }

    println("Добро пожаловать $login")

}