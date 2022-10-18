package module7.PracticalWork6

object Channels {
    private val chanList = listOf(
        "Первый канал",
        "Россия 1",
        "Россия К",
        "Россия 24",
        "ОТР",
        "ТВ Центр",
        "НТВ",
        "РЕН-ТВ",
        "ТВ-3",
        "Пятый канал",
        "Матч ТВ",
        "Карусель",
        "Муз-ТВ",
        "СТС",
        "ТНТ",
        "Пятница",
        "Домашний",
        "Спас",
        "Мир",
        "Звезда")

    fun getRandomChannels(): List<String> {
        return chanList.shuffled()

    }




}