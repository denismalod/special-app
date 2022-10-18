package module11.lesson3

enum class Color(val hex: String): Drawable {
    WHITE("#FFF"),
    BLACK("#000"),
    RED("F00"){
        override fun draw() {
            println("overridden draw fun")
        }
              },

    GREEN("#0F0"),
    GRAY("#888"),
    BLUE("#00F");

    fun someMethod() {
        println ("print something")
    }

    override fun draw() {
        println("draw color $hex")
    }
}