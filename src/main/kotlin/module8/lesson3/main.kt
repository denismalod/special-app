package module8.lesson3

fun main() {
    val person = Person ("Alex", 25)
    val driver = Driver("Ivan", 46, 2)

    person.age
    person.name
    person.sleep()
    person.eat()
    person.walk()

    driver.name
    driver.age
    driver.sleep()
    driver.eat()
    driver.walk()
    driver.experience
    driver.drive()

    val ktDev=KotlinDeveloper("Alex", 25)
    val javaDev = JavaDeveloper(name = "Ivan", age = 40, experience=20)
    val cppDev = CppDeveloper(name = "Anna", age = 30, experience=7)
    val developer = Developer(name="MegaMozg", age = 100, experience =100)
    val scalaDev = ScalaDeveloper(name="ScalaDeveloper", age = 30, experience =5)

    ktDev.writeCode()
    println("ktDev level - ${ktDev.getLevel()}")
    //println("experience - ${ktDev.experience}")

    javaDev.writeCode()
    println("javaDev level - ${javaDev.getLevel()}")
    //println("experience - ${javaDev.experience}")

    cppDev.writeCode()
    println("cppDev level - ${cppDev.getLevel()}")
    //println("experience - ${cppDev.experience}")

    developer.writeCode()
    println("cppDev level - ${developer.getLevel()}")
    //println("experience - ${developer.experience}")

    println("javaDev paradigm - ${javaDev.paradigm}")
    //println("ScalaDev paradigm - ${scalaDev.paradigm}")





}