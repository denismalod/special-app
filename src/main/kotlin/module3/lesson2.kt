package module3

fun main() {
    val anonimous: (Int) -> Unit = fun(a: Int) { println(a) }
    anonimous(123)

    val lambda = { println("HelloWorld") }
    val lambdaWithParams = { message: String -> println(message) }
    val lambdaWithParamAndReturnValue = { a: Int, b: Int ->
        val mult = a * b
        println(mult)

    }

    val str = "This is a typical task for developer interview"
    println(str.count { char -> checkSymbol(char) })
    println(str.count { it -> checkSymbol(it) })
    println(str.count { checkSymbol(it) })
    println(str.count { it == 'e' })

    val vowels = "aeoiu"
    println(str.filter { it !in vowels })


}

fun checkSymbol(char: Char): Boolean = char == 'e'

fun multiply(func: () -> Unit) {}