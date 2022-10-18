package module8.practicalWork7


class NatureReserve(list: MutableList<Animal> = mutableListOf()) {

    private var listAnimal: MutableList<Animal> = mutableListOf()

    init {
        listAnimal.addAll(list)
        println("Заповедник инициализирован, в нём ${listAnimal.size} животных")

    }

    fun lifeCircle() {
        for (i in 1..10) {
            val newBorn: MutableList<Animal> = mutableListOf()
            val dead: MutableList<Animal> = mutableListOf()
            listAnimal.forEach {
                when ((1..4).random()) {
                    1 -> it.walk()
                    2 -> it.eat()
                    3 -> it.sleep()
                    4 -> newBorn.add(it.birth())
                }
                if (it.curAge > it.maxAge) {
                    dead.add(it)
                    println("Умер ${it.name}")
                }
            }
            listAnimal.addAll(newBorn)
            listAnimal.removeAll(dead)
            if (listAnimal.size == 0) {
                println("Все животные исчезли с заповедника")
                return
            }
        }
        println("В заповеднике ${listAnimal.size} животных")
    }
}