package module7.lesson1

fun main () {
    val auto = Car()
    println("Auto info")
    println("${auto.brand} ${auto.model} ${auto.color} color ")

    auto.start()
    auto.move()
    auto.move()
    auto.move()
    auto.move()
    auto.move()
    auto.stop()

}