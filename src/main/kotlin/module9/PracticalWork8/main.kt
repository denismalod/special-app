package module9.PracticalWork8

fun main () {

    val creditCard = CreditCard(1000,10000)
    creditCard.getBalance()
    creditCard.pay(2000)
    creditCard.cashIn(2000)
    println ("++++++++++++++++")

    val debitCard = DebitCard(1000)
    debitCard.getBalance()
    debitCard.pay(2000)
    debitCard.cashIn(2000)
    debitCard.cashIn(2000)
    println ("++++++++++++++++")

    val debitCardBonus = DebitCardBonus(2000,1)
    debitCardBonus.getBalance()
    debitCardBonus.pay(2000)
    debitCardBonus.cashIn(2000)
    debitCardBonus.pay(300)
    println ("++++++++++++++++")

    val creditCardCashback = CreditCardCashback(2000,70000, 5)
    creditCardCashback.getBalance()
    creditCardCashback.pay(4100)
    creditCardCashback.cashIn(2000)
    creditCardCashback.pay(1000)
    creditCardCashback.cashIn(9000)
    println ("++++++++++++++++")

    val debitCardInterest = DebitCardInterest(5000,0.005)
    debitCardInterest.getBalance()
    debitCardInterest.pay(4100)
    debitCardInterest.cashIn(2000)
    debitCardInterest.pay(1000)
    debitCardInterest.cashIn(9000)
    println ("++++++++++++++++")



}