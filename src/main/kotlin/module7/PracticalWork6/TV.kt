package module7.PracticalWork6

class TV(
    val brand: String,
    val model: String,
    val diagSize: Int,
    val maxChan: Int = 20
) {

    var tvOn: Boolean = false
        private set
    var currentVol: Int = 0
    var currentChan: Int = 1
    private val chanList: List <String>

    init {
        println("Настройка каналов")
        chanList = Channels.getRandomChannels()

    }

    fun turnTvOn() {
        println("ТВ включен")
        tvOn = true
    }

    fun turnTvOff() {
        println("ТВ выключен")
        tvOn = false
    }

    fun volUp(stepVol: Int) {
        if (tvOn) {
            val needVol = currentVol + stepVol
            if (maxVol > needVol) {
                currentVol = needVol
                println("Громкость увеличена до $currentVol")

            } else {
                currentVol = maxVol
                println("Установлена максимальная громкость $currentVol")
            }
        }

    }

    fun volDown(stepVol: Int) {
        if (tvOn) {
            currentVol = maxOf(0, currentVol - stepVol)
            println("Громкость уменьшена до $currentVol")
        }
    }

    fun chanNum(num: Int) {
        if (!tvOn) turnTvOn()
        currentChan =  minOf(maxChan, num)
        println("Номер канала $currentChan - ${chanList[currentChan-1]}")
    }

    fun chanUp() {
        if (!tvOn) turnTvOn()
        if (currentChan + 1 > maxChan)
            currentChan = 1
        else
            currentChan++

        println("Номер канала $currentChan - ${chanList[currentChan-1]}")
    }

    fun chanDown() {
        if (!tvOn) turnTvOn()
        if (currentChan - 1 < 1)
            currentChan = maxChan
        else
            currentChan--

        println("Номер канала $currentChan - ${chanList[currentChan-1]}")
    }

    fun showChanList() {
        println ("Список каналов:")
        for (i in 1..maxChan)
               println("канал $i - ${chanList[i-1]}")
    }

    companion object {
        const val maxVol = 100
    }


}