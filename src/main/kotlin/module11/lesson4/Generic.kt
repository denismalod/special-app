package module11.lesson4

import java.util.*

class Generic<out T : Number> (value: T){
    private var item: T? = value
    val initializedDate = Date()

    fun getItem() = item  //так как теперь item приватная прямого доступа к ней нет


//    fun setItem(newItem: T?) {  //нельзя изменять переменную item
//        item= newItem
//    }
}




//class Generic<T : Number> (value: T){
//    var item: T? = value
//        private set
//    val initializedDate = Date()
//
//    fun setItem(newItem: T?) {
//        item= newItem
//    }
//}