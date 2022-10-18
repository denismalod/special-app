package module10.lesson1

fun main () {
    val devices = listOf(MobilePhone(), AppleWatch(), DiskPhone(), SmartFridge())
    devices.forEach { it.call("7(999)999-99-99")}

    val mobilePhone = MobilePhone()
    mobilePhone.call("7(999)999-99-99")
    mobilePhone.playVideo("www.example.com")

    val webBrowser = listOf<WebBrowser>(SmartTV(), MobilePhone())
    webBrowser.forEach {
        it.playVideo(("www.example2.com"))
    }

}