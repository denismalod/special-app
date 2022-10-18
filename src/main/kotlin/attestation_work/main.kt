package attestation_work

fun main() {
    var numPhoneNumbers = 0

    while (numPhoneNumbers <= 0) {
        println("Введите количество телефонных номеров N: ")
        val checkNull = readLine()?.toIntOrNull()
        if ((checkNull == null) || (checkNull <= 0)) {
            println("Некорректное число")
            continue
        } else
            numPhoneNumbers = checkNull
    }

    val phoneNumbers = getPhoneNumbers(numPhoneNumbers)

    //println(phoneNumbers.joinToString(","))

    println("Номера телефонов, начинающиеся с приставки +7: ")
    val filteredPhoneNumbers = phoneNumbers.filter { it.startsWith("+7") }
    println(filteredPhoneNumbers.joinToString(","))

    val setPhoneNumbers = phoneNumbers.toSet()
    val uniquePhoneNumbers = setPhoneNumbers.groupBy { it }
    //println(uniquePhoneNumbers.keys)

    println("Количество уникальных номеров: ${uniquePhoneNumbers.keys.size}")

    println("Сумма длин всех номеров телефонов : ${phoneNumbers.sumOf { it.length }}")


    val mapPhoneNumbers = mutableMapOf<String, String>()
    for (i in 0 until (uniquePhoneNumbers.size)) {
        val uniquePhoneNumber = uniquePhoneNumbers.keys.elementAt(i)
        println("Введите имя пользователя номера телефона $uniquePhoneNumber :")
        val name = readLine().toString()
        mapPhoneNumbers[uniquePhoneNumber] = name
    }

    mapPhoneNumbers.forEach { (key, value) ->
        println("\u26AA \"Человек: $value. Номер телефона: $key\"")
    }


}

fun getPhoneNumbers(numPhoneNumbers: Int): MutableList<String> {
    val phoneNumbers = mutableListOf<String>()

    for (i in 0 until numPhoneNumbers) {
        println("Введите ${i + 1} номер телефона:")
        val phoneNumber = readLine().toString()
        phoneNumbers.add(phoneNumber)
    }
    return phoneNumbers


}