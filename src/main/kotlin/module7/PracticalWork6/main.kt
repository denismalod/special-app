package module7.PracticalWork6

import module7.lesson3.Car


fun main(){
    val sm = TV(brand = "Samsung", model="QLED", diagSize = 55, maxChan = 12)

    printInfo(sm)

    sm.showChanList()
    sm.turnTvOn()

    for (i in 1..6) {
        sm.volUp(20)
        Thread.sleep(500)
    }

    for (i in 1..6) {
        sm.volDown(20)
        Thread.sleep(500)
    }

    for (i in 8..12) {
        sm.chanNum(i)
        Thread.sleep(500)
    }

    for (i in 1..7) {
        sm.chanUp()
        Thread.sleep(500)
    }
    sm.turnTvOff()

    for (i in 1..7) {
        sm.chanDown()
        Thread.sleep(500)
    }

    val lg = TV(brand = "LG", model="Syntec", diagSize = 50)

    printInfo(lg)

    lg.showChanList()
    lg.turnTvOn()

    for (i in 1..6) {
        lg.volUp(20)
        Thread.sleep(500)
    }

    for (i in 1..6) {
        lg.volDown(20)
        Thread.sleep(500)
    }

    for (i in 15..22) {
        lg.chanNum(i)
        Thread.sleep(500)
    }

    for (i in 1..7) {
        lg.chanUp()
        Thread.sleep(500)
    }
    lg.turnTvOff()

    for (i in 1..7) {
        lg.chanDown()
        Thread.sleep(500)
    }


}

fun printInfo(tv: TV) {
    println("Марка - ${tv.brand}, модель - ${tv.model}, диагональ - ${tv.diagSize}")
}