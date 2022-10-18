package module10.lesson4

import module8.lesson3.Developer
import module8.lesson3.Person

fun main() {
    val  person: Person = Person("Tony", 40)
    val developer: Developer? = person as? Developer

    developer?.writeCode()
    println(developer?.getLevel()+" "+developer?.paradigm )



//    val developer= Developer("Tony", 40)
//    developer.writeCode()
//    developer.getLevel()
//
//    val person: Person = developer
//    person.writeCode() //не работает


}



