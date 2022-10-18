package module10.lesson1

class SmartTV : Callable, WebBrowser {
    override val vendor = "Xiaomi"
    override fun call(number: String) {
        println("SmartTV calling $number")
    }

    override fun playVideo(url: String) {
        println ("SmartTV playing video from $url")
    }
}