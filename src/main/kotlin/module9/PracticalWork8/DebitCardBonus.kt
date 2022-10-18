package module9.PracticalWork8

class DebitCardBonus (balance: Int, private val bonusPercent: Int) : DebitCard(balance) {

    private var bonus: Int = 0

    override fun pay(cash: Int): Boolean {
        val checkBalance: Int = balance - cash
        if (checkBalance >= 0) {
            balance = checkBalance
            bonus += (cash * bonusPercent / 100)
        }
        else {
            println("Недостаточно средств")
            return false
        }
        println("После оплаты на $cash:")
        println("Собственные средства: $balance.")
        println("Бонус: $bonus.")
        return true
    }

    override fun getAvailFund() {
        println("Собственные средства: $balance.")
        println("Бонус: $bonus.")
    }
}