package module3

fun main() {
    val result: Int = multiply(1234, 2345)
    println(result)
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun multiply(a: Int, b: Double): Int = (a * b).toInt()
fun multiply(a: Double, b: Int, c: Int): Double = a * b * c