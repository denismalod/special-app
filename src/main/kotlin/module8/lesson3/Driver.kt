package module8.lesson3

class Driver(
    nameArg: String,
    ageArg: Int,
    val experience: Int
) : Person(nameArg, ageArg) {
    fun drive() = println("driving")

}