package module9.PracticalWork8

abstract class BankCard (var balance: Int) {



    var cash: Int =0

    abstract fun cashIn(cash: Int)
    abstract fun pay(cash: Int): Boolean
    abstract fun getBalance()
    abstract fun getAvailFund()








}