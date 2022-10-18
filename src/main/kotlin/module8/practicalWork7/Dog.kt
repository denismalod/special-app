package module8.practicalWork7
import kotlin.random.Random

class Dog(
    energy: Int,
    weight: Int,
    curAge: Int,
    maxAge: Int,
    name: String
) : Animal(energy, weight, curAge, maxAge, name) {

    override fun walk() {
        super.walk()
        if (move) println("бежит")
    }

    override fun birth(): Dog {
        val newBorn = Dog(Random.nextInt(1, 10), Random.nextInt(1, 5), 0, maxAge, name)
        println("Рождена собака - ${newBorn.name}, энергии ${newBorn.energy}, " +
                "вес ${newBorn.weight}, возраст ${newBorn.curAge}, максимальный возраст ${newBorn.maxAge}")
        return newBorn
    }

}