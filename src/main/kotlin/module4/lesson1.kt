package module4

fun main() {
    println("Enter a:")
    val a: Int = readLine()?.toIntOrNull() ?: return
    println("Enter b:")
    val b: Int =readLine()?.toIntOrNull() ?: return
    println("Enter c:")
    val c: Int =readLine()?.toIntOrNull() ?: return

    val x = solveEquation(a, b, c)

    if (x==null)
        println("No solution")
    else
        println(x)

}
fun solveEquation (a: Int, b: Int, c: Int): Double? {
    if (a==0) return null
    return (c-b)/a.toDouble()
}

fun max(a: Int, b: Int): Int = if (a > b)  a else  b


fun getDeveloperPosition (experience: Int): String {
    when (experience) {
    0 -> return "intern"
    in 1..2 ->return "junior"
    in 3..4 ->return "middle"
    in 4..5 ->return "senior"
    else -> return "leading"
    }
}

fun getUserAccess (isAutorized: Boolean, role: String): String {
    return when {
        !isAutorized -> "Restricted"
        role== "Admin"->"Full"
        role == "Moderator" -> "Limited"
        else -> "Common"
    }
}

