package module10.lesson1

class AppleWatch : Callable {
    override val vendor = "Apple"

    override fun call(number: String) {
        println("smart watches calling $number")
    }
}