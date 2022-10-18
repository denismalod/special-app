package module8.practicalWork7



fun main() {
    val dog = Dog(25, 15, 7, 7, "Лабрадор")
    val dog2 = Dog(25, 18, 3, 8, "Овчарка")
    val bird = Bird(15, 2, 1, 5, "Воробей")
    val bird2 = Bird(20, 7, 2, 5, "Голубь")
    val bird3 = Bird(25, 8, 5, 10, "Ворон")
    val bird4 = Bird(30, 12, 7, 7, "Орёл")
    val bird5 = Bird(15, 3, 3, 4, "Соловей")
    val fish = Fish(25, 1, 2, 3, "Карась")
    val fish2 = Fish(25, 5, 4, 4, "Щука")
    val cow = Animal(32, 70, 3, 5, "Корова")
    val el = Animal(82, 370, 3, 35, "Слон")
    val leon = Animal(45, 140, 5, 25, "Лев")
    val list= mutableListOf(dog,dog2,bird,bird2,bird3,bird4,bird5,fish,fish2,cow,cow,cow,el,leon,leon)

    val natRes = NatureReserve(list)
    natRes.lifeCircle()

}