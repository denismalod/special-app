package module11.lesson4

import module7.lesson1.Car
import module8.lesson3.Developer
import module8.lesson3.Person

fun main() {
    val first = Generic<Double>(5.0)
    val second = Generic<Int>(10)

    println(sum(first, second))

    val developer = Developer("Tony", 40)
    printDeveloper(Printer<Person>(), developer)


//    val first = Generic<Number>(5.0)
//    val second = Generic<Number>(10)
//    println(sum(first, second))

    var object1 = Generic<Int>(5)
    //object1.item = 5
    //object1.setItem(6)

//    val object2 = Generic<String>("Generic String")
//    //object2.item = "Generic String"
//
//    val object3 = Generic<Car>(Car())
//    //object3.item = Car()
//
//    val person = Generic<Person> (Person("Tony",35))
//    person.setItem(Developer("Developer",25))




    val list: List<String> = List(5) { "" }
    val intList = listOf(1, 2, 3, 4)

    println(genericFun(5))
    println(genericFun("hello"))
    println(genericFun(Car()))
    println(genericFun(null))

}

fun <T> genericFun(input: T) : String {
    return  input?.toString() ?: "object is null"
}

//fun <T> genericFun(input: T) : T {   // функция может возвращать объест типа Т
//    return  input
//}

fun sum(a: Generic<Number>, b: Generic<Number>): Int? {
    val first = a.getItem()?.toInt() ?: return null
    val second = b.getItem()?.toInt() ?: return null
    return first + second
}

//fun sum(a: Generic<Number>, b: Generic<Number>): Int? { // теперь переменная item приватная
//    val first = a.item?.toInt() ?: return null
//    val second = b.item?.toInt() ?: return null
//    return first + second
//}

fun printDeveloper(printer: Printer<Developer>, developer: Developer) {
    //some logic
    printer.print(developer)
}