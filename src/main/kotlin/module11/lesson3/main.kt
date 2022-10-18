package module11.lesson3

fun main() {
    Color.values().forEach {
        println("${it.name} - ${it.ordinal}")
    }
    Color.WHITE
    println(Color.WHITE.hex)
    Color.WHITE.draw()
    Color.RED.draw()

    println(Color.values().joinToString(","))
    println(Color.valueOf("RED").hex)

    val map = mutableMapOf(
        1 to "1",
        2 to "2",
        3 to "3"
    )

    for ((key,value) in map) {
        println("$key - $value")
    }
    val person = Person("name", "lastName")

    val (name, lastName)= person

    switchColor(SealedColor.White)


//    val name =person.component1()
//    val lastName = person.component2()
}

fun switchColor(color: Color): Color =
    when (color) {
        Color.WHITE -> Color.BLACK
        Color.BLACK -> Color.RED
        Color.RED -> Color.GREEN
        Color.GREEN -> Color.BLUE
        Color.BLUE -> Color.BLACK
        Color.GRAY -> Color.BLACK
    }
fun switchColor(color: SealedColor) : SealedColor =
    when(color) {
        SealedColor.White -> SealedColor.Black
        SealedColor.Black -> SealedColor.Red
        SealedColor.Red -> SealedColor.Green
        SealedColor.Green -> SealedColor.Blue()
        is SealedColor.Blue -> SealedColor.Black
        is SealedColor.CustomColor -> SealedColor.CustomColor("#345")

    }