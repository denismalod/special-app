package module5

import kotlin.random.Random

fun main() {
    // val list = listOf<Int> (1,2,3,4)
    //val carList = listOf<String>("Mercedes", "BMW", "Ferrari")

    val emptyList = listOf<String>()
    val secondEmptyList = emptyList<String>()

    val secondList = List(5) {}
    val secondCarList = List<String>(3) { index -> "Car №${index}" }

    //val mutableList = mutableListOf<Int>(1,2,3,4)
    val mutableCarList = mutableListOf<String>("Mercedes", "BMW", "Ferrari")

    val mutableSecondList = MutableList<Int>(5) { 0 }
    val mutableSecondCarList = MutableList<String>(3) { index -> "Car №${index}" }

    val list = listOf(1, 2, 3, 4)
    val mutableList = mutableListOf<Int>(1, 2, 3, 4,5)


    println(mutableList.size)
    mutableList[1] = 4
    mutableList.add(6)
    mutableList.add(7)

    println(mutableList.size)
    println(mutableList.joinToString ( ","))
    println(list[list.lastIndex])

    // for ( i in 0..list.size-1)
    for ( i in list.indices)
        println(list[i]*i)

    list.forEach{item -> println(item*5)}
    list.forEachIndexed{index, item -> println(item*index)}

    println(list.sumOf{it*5})

    val carList = listOf<String>("Mercedes", "BMW", "Ferrari")
    println(carList.sumOf{it.length})

    val numbers = MutableList(10) { Random.nextInt(-10,10)}
    println(numbers)
    val candidatesToRemove = mutableListOf<Int>()
    numbers.forEach {
        if (it<0)
            candidatesToRemove.add(it)

    }
    numbers.removeAll(candidatesToRemove)
    println(numbers)

    val iterator = numbers.iterator()
    while (iterator.hasNext()) {
        val item = iterator.next()
        if (item in 0..2)
            iterator.remove()
    }
    println(numbers)

    numbers.removeAll {it in 5..10}
    println(numbers)

    val list3 = listOf(1,2,3,4,5)
    val mutableList3 = list.toMutableList()
    mutableList3.add(10)
    println(mutableList3)

    val stringList = list.map{
        "This was a number $it"
    }
    stringList.forEach {println(it)}
    println(stringList)

    val mutableStringList = stringList.toMutableList()
    mutableStringList.add("new string")
    mutableStringList.forEach {println(it)}

}