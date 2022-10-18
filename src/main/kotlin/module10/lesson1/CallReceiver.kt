package module10.lesson1

interface CallReceiver : Callable {
    fun receiveCall (number: String) {
        println("$vendor receive call from $number")
    }
}