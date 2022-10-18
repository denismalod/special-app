package module8.lesson3

class KotlinDeveloper: Developer {
    constructor(name: String, age: Int): super(name, age)
    constructor(name: String, age: Int, experience: Int): super(name, age, experience)

    override fun writeCode() {
        println("kt developer writing kotlin code")
        super.getCoffeeBreak()

    }

    override fun getCoffeeBreak () = true
}

//fun test() {
//    val developer = KotlinDeveloper("Alex", 25)
//}
