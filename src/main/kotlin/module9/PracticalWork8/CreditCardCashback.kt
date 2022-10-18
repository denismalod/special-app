package module9.PracticalWork8

class CreditCardCashback(
    balance: Int,
    private val creditLimit: Int,
    private val cashbackPercent: Int
) : CreditCard(balance, creditLimit) {

    var cashback: Int = 0
    var sumPay: Int = 0

    override fun pay(cash: Int): Boolean {
        val checkDebit: Int = balance - cash
        if (checkDebit >= 0) {
            sumPay +=cash
            balance = checkDebit
            if (sumPay > 5000) cashback = (sumPay * cashbackPercent / 100)
        } else {
            val checkCredit: Int = credit + checkDebit
            if (checkCredit >= 0) {
                balance = 0
                credit = checkCredit
                sumPay +=cash
                if (sumPay > 5000) cashback = (sumPay * cashbackPercent / 100)
            } else {
                println("Недостаточно средств")
                return false
            }
        }
        println("После оплаты на $cash:")
        println("Кредитные средства: $credit.")
        println("Собственные средства: $balance.")
        println("Сумма покупок: $sumPay.")
        println("Кэшбэк: $cashback.")
        return true
    }

    override fun getAvailFund() {
        println("Кредитная карта с лимитом  $creditLimit")
        println("Кредитные средства: $credit.")
        println("Собственные средства: $balance.")
        println("При сумме покупок более чем на 5000 кэшбэк = $balance.")
        println("Сумма покупок: $sumPay.")
    }

}