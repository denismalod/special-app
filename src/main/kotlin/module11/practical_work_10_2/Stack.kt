package module11.practical_work_10_2

class Stack<T> {
    private val allElements = arrayListOf<T>()

    fun push (element: T) {
        allElements.add(element)
    }

    fun pop (): T? = allElements.removeLastOrNull()

    fun isEmpty() : Boolean = allElements.isEmpty()

    fun patronsLeft() = allElements.size

}