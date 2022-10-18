package module2

fun main(){
    val escapedString = "Hello\nWorld"
    println(escapedString)

    val commonString = """Hello
        |kotlin
        |This
        |is a 
        |common string
    """.trimMargin()
    println(commonString)

    val secondChar = commonString[1]
    println(secondChar)

    val hello = "Hello"
    println(hello + "kotlin")

    println(hello.uppercase())

    //Длина строки %str% - %length% символов
    val longStr = "The longest string you've ever seen"

    val resultString = "Length of " +"\"" + longStr + "\"" + longStr.length + " symbols"
    println(resultString)

    val  resultString2= "Length of \" $longStr \" - ${longStr.length} symbols"
    println(resultString2)

    val str = "Hello Kotlin"
    println(str.contains("H"))
    println(str.contains ("Kotlin"))
    println(str.contains("World"))

    println(str.replace("l","2"))

    val replaceFirst = str.replaceFirst("Hello", "First")
    println(replaceFirst)
 }