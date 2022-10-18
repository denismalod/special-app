package module9.PracticalWork8

open class DebitCard(balance: Int) : BankCard(balance) {

    override fun cashIn(cash: Int) {
        balance += cash
        println("После пополнения карты на  $cash:")
        println("Собственные средства: ${balance}.")
    }

    override fun pay(cash: Int): Boolean {
        val checkBalance: Int = balance - cash
        if (checkBalance >= 0)
            balance = checkBalance
        else {
            println("Недостаточно средств")
            return false
        }

        println("После оплаты на $cash:")
        println("Собственные средства: $balance.")
        return true
    }
    override fun getBalance() {
        println("Собственные средства: $balance.")
    }

    override fun getAvailFund() {
        println("Собственные средства: $balance.")
    }
}


