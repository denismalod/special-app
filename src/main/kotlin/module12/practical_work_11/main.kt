package module12.practical_work_11

fun main() {
    val wheel = Wheel()
    wheel.pumpUpWheel(-7.0)
    wheel.pumpUpWheel(10.0)
    wheel.pumpUpWheel(1.1)
    wheel.pumpUpWheel(3.3)
    wheel.pumpUpWheel(2.1)
}


class TooHighPressure(pressure: Double) :
    Exception(
        "При накачке $pressure атмосфер процедура удалась. " +
                "Эксплуатация невозможна — давление превышает нормальное."
    )

class TooLowPressure(pressure: Double) :
    Exception(
        "При накачке $pressure атмосфер процедура удалась. " +
                "Эксплуатация невозможна — давление ниже нормального."
    )

class IncorrectPressure(pressure: Double) :
    Exception("При накачке $pressure атмосфер процедура не удалась.")

class Wheel() {
    private var currentPressure: Double = 0.0


    fun pumpUpWheel(pressure: Double) {
        try {
            currentPressure = checkPressureOfWheel(pressure)
        } catch (e: Exception) {
            println(e.message)
        }
    }

    fun checkPressureOfWheel(pressure: Double): Double {
        if (pressure < 0 || pressure >= 10)
            throw IncorrectPressure(pressure)
         else if (pressure < 1.6)
            throw TooLowPressure(pressure)
        else if (pressure > 2.5)
            throw TooHighPressure(pressure)

        println("При накачке $pressure атмосферы процедура удалась. Эксплуатация возможна.")
        return pressure


    }

}