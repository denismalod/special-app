package module5

import java.util.*
import kotlin.collections.HashSet

fun main() {
    val map = mapOf<Int, String>(1 to "2", Pair(2, "123"))
    val mutableMap = mutableMapOf<Int, String>()
    val hashMap = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    val treeMap = sortedMapOf(1 to "one")
    val linkedHashMap = linkedMapOf<Int, Int>()

    val priceList = mutableMapOf<String, Int>(
        "Milk" to 80,
        "Yogurt" to 50,
        "Apples" to 150,
        "Bananas" to 70,
        "Coca-cola" to 100,
        "Orange juice" to 150
    )

    val priceListHash = hashMapOf(
        "Milk" to 80,
        "Yogurt" to 50,
        "Apples" to 150,
        "Bananas" to 70,
        "Coca-cola" to 100,
        "Orange juice" to 150
    )

    val priceListSorted = sortedMapOf(
        "Milk" to 80,
        "Yogurt" to 50,
        "Apples" to 150,
        "Bananas" to 70,
        "Coca-cola" to 100,
        "Orange juice" to 150
    )
    println(priceList)
    println(priceListHash)
    println(priceListSorted)

    priceList["Ice cream"] = 75
    priceList["Milk"] = 90
    println(priceList)

    priceList.remove("Yogurt")
    println(priceList)

    println(priceList.keys)
    println(priceList.values.maxOrNull())
    val maxValue = priceList.values.maxOrNull()
    println(priceList.filterValues { it == maxValue })

    for (entry in priceList.entries) {
        println("${entry.value} - ${entry.key}")

    }

    priceList.forEach { (value3, key3) ->
        println("$key3-$value3")
    }

    val sortedMap = priceList.toSortedMap()
    println(sortedMap)

    println(sortedMap.toSortedMap(compareBy { it.length }))

    println(sortedMap.toSortedMap(compareBy<String> { it.length }.thenBy { it }))  //сортировка по ключу

    println(sortedMap.toSortedMap(compareBy<String?> { sortedMap[it] }.thenBy { it }))  //сортировка по значению

    // множества

    val set = setOf(1, 2, 2, 3, 1, 2)  // неизменяемое множество
    val hashSet = hashSetOf(1, 2, 2, 3, 1, 2)  // изменяемые множества
    val sortedSet = sortedSetOf(1, 2, 2, 3, 1, 2).toSet()
    val linkedSet = linkedSetOf(1, 2, 2, 3, 1, 2)

    val hasSet2 = HashSet<String>()
    val sortedSet2 = TreeSet<String>()
    val linkedSet2 = LinkedHashSet<String>()

    val firstSet = setOf(1, 2, 3, 4)
    val secondSet = setOf(3, 4, 5, 6)

    val unionSet = firstSet.union(secondSet)  //сложение
    val subtract = firstSet.subtract(secondSet)  //вычетание
    val intersect = firstSet.intersect(secondSet)  //пересечение

    val northBusSet = setOf(1,4,5,6,12,13,16,19,20)
    val southBusSet = setOf(1,2,3,7,4,5,6,7,8,16,19,20,31)

    val onlyNorthBus = northBusSet.subtract(southBusSet)
    val onlySouthBus = southBusSet.subtract(northBusSet)
    val globalBus = northBusSet.intersect(southBusSet)

    println(onlyNorthBus)
    println(onlySouthBus)
    println(globalBus)


}

