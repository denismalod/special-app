package module8.practicalWork7
import kotlin.random.Random

class Fish (
    energy: Int,
    weight: Int,
    curAge: Int,
    maxAge: Int,
    name: String
): Animal(energy, weight, curAge, maxAge, name) {

    override fun walk() {
        super.walk()
        if (move) println("плывёт")
    }

    override fun birth(): Fish {
        val newBorn = Fish(Random.nextInt(1, 10), Random.nextInt(1, 5), 0, maxAge, name)
        println(
            "Рождена рыба - ${newBorn.name}, энергии ${newBorn.energy}, " +
                    "вес ${newBorn.weight}, возраст ${newBorn.curAge}, максимальный возраст ${newBorn.maxAge} "
        )
        return newBorn
    }

}