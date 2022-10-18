package module11.lesson5

fun main() {
 printNumber(8)
}

//fun Int.isEven(): Boolean {     // функция расширения класса Int, доступ к объекту класса с помощью this
//    return this % 2 == 0
//}

fun printNumber(number: Int) {
//    println(number.isEven())
//    println(5.isEven())

    val a = Int.random()
    println("$a" )

    println( number.isEven)
    println(5.isEven)

}

fun Int.Companion.random() : Int {  //расширение объекта компаньона
    return (System.currentTimeMillis()%43).toInt()
}

val Int.isEven                // для свойства расширения обязательно нужно указывать геттер
    get() = this % 2 == 0