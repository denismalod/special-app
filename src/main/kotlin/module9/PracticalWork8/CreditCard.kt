package module9.PracticalWork8

open class CreditCard(balance: Int, private val creditLimit: Int) : BankCard(balance) {

    var credit: Int = creditLimit

    override fun cashIn(cash: Int) {
        if (credit<=creditLimit){
            val checkCash = creditLimit - credit
            if (checkCash >= cash)
                credit +=cash
            else{
                credit = creditLimit
                balance += (cash-checkCash)
            }

        }
        else
            balance += cash

        println("После пополнения карты на  $cash:")
        println("Кредитные средства: ${credit}.")
        println("Собственные средства: ${balance}.")
    }

    override fun pay(cash: Int): Boolean {
        val checkDebit: Int = balance - cash
        if (checkDebit >= 0)
            balance = checkDebit
        else {
            val checkCredit: Int = credit + checkDebit
            if (checkCredit >= 0) {
                balance = 0
                credit = checkCredit

            } else {
                println("Недостаточно средств")
                return false
            }
        }
        println("После оплаты на $cash:")
        println("Кредитные средства: $credit.")
        println("Собственные средства: $balance.")
        return true
    }


    override fun getBalance() {
        println("Кредитные средства: $credit.")
        println("Собственные средства: $balance.")
    }

    override fun getAvailFund() {
        println("Кредитная карта с лимитом  $creditLimit")
        println("Кредитные средства: $credit.")
        println("Собственные средства: $balance.")
    }

}