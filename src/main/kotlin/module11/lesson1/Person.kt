package module11.lesson1

class Person(
    val name: String,
    val lastName: String,
    val passportSeries: Int,
    val passportNumber: Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (passportSeries != other.passportSeries) return false
        if (passportNumber != other.passportNumber) return false

        return true
    }

    override fun hashCode(): Int {
        var result = passportSeries
        result = 31 * result + passportNumber
        return result
    }

    override fun toString(): String {
        return "Person(name='$name', lastName='$lastName', passportSeries=$passportSeries, passportNumber=$passportNumber)"
    }
}