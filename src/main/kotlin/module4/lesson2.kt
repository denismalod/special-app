package module4

fun main() {
    println("Enter a number")
    val n = readLine()?.toIntOrNull() ?: return

    var sum = 0
    for (j in 0..n) {
        if (j % 2 != 0) continue
        println(j)
        sum += j
    }

//    var i: Int = 0
//    var sum = 0
//    while (i<=n) {
//        println(i)
//        sum +=i
//        i++
//    }
    println("Sum of first $n number - $sum")
}