package module11.lesson4

import module8.lesson3.Person

class Printer<in T: Person> {
    fun print(person: T) {
        println("Person ${person.name}")
    }
}