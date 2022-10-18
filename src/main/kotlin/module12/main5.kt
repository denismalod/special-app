package module12

fun main() {
    try {
        val checkedAge1 = checkAge(5)
        val checkedAge2 = checkAge(-111)
    }
    catch (e: Exception){
        println(e.message)
    }
}
class IncorrectPressure(): Exception("сообщение 1")
class IncorrectPressure2(): Exception("сообщение 2")

fun checkAge(age: Int): Int{
    if(age < 1 ) throw  IncorrectPressure()
    if(age > 110) throw  IncorrectPressure2()

    println("Age $age is valid")
    return age
}