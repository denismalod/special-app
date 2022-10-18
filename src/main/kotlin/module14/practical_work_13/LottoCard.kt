package module14.practical_work_13

import kotlin.random.Random
import kotlin.random.nextInt

class LottoCard {
    var numLine1 = mutableListOf(0, 0, 0, 0, 0, 0, 0, 0, 0)
    var numLine2 = mutableListOf(0, 0, 0, 0, 0, 0, 0, 0, 0)
    var numLine3 = mutableListOf(0, 0, 0, 0, 0, 0, 0, 0, 0)
    var allLines = mutableListOf<Int>()


    fun fillCard() {
        fillLine(numLine1)
        fillLine(numLine2)
        fillLine(numLine3)
        println("-------------------------------------")
    }


    private fun fillLine(numLine: MutableList<Int>) {
        var index = 0
        var count = 0
        while (count != 5) {
            val num = Random.nextInt(1..90)
            var check: Boolean = true

            allLines.forEach {
                if (it == num) check = false
            }
            if (check) {
                index = ((num - 1) / 10)
                if (numLine[index] == 0) {
                    numLine[index] = num
                    allLines.add(num)
                    count++
                }

            }
        }
        println(numLine.joinToString("\t"))

    }

    private fun checkLine(numLine: MutableList<Int>, num: Int): Boolean {
        val index = (num - 1) / 10
        var check = true
        if (numLine[index] == num ) {
            numLine[index] = num *(-1)
        }
        numLine.forEach {
            if (it > 0) check = false
        }
        if (check) {
            print("\n\nЗакрыты все числа в строке:")
            numLine.forEach{item -> print("\t${item*-1}")}
            println()

        }
        return check
    }

    fun checkCard(num: Int): Boolean =
        (checkLine(numLine1, num) || checkLine(numLine2, num) || checkLine(numLine3, num))
}
