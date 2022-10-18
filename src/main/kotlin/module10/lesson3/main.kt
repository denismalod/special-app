package module10.lesson3

import module10.lesson1.Callable

fun main() {
    val evenChecker = IntPredicate { i -> i % 2 == 0 }

    println("8 is even: ${evenChecker.accept(8)}")
    println("9 is even: ${evenChecker.accept(9)}")

//    val anonymous = object : Callable{
//        val name = "anonymous"
//        val lastName = "object"
//        fun method() = println("anonymous object")
//        override val vendor = "anonymous vendor"
//
//        override fun call(number: String) {
//            println("anonymous object calling")
//        }
//    }
//
//    anonymous.name
//    anonymous.lastName
//    anonymous.method()
//
//    val test = AnonymousTest()
//    test.testMethod(anonymous)
}

fun interface IntPredicate {
    fun accept(i: Int): Boolean

}

class AnonymousTest {
    private fun createAnonymousObject() = object : Callable {
        val name = "anonymous"
        val lastName = "object"
        fun method() = println("anonymous object")
        override val vendor = "anonymous vendor"

        override fun call(number: String) {
            println("anonymous object calling")
        }
    }

    fun testMethod(obj: Callable) {
        val obj = createAnonymousObject()
        obj.vendor
        obj.call("")
        obj.name

    }
}