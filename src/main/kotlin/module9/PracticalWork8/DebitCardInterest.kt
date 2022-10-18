package module9.PracticalWork8

class DebitCardInterest(balance: Int, val percentInterest: Double) : DebitCard(balance) {

    var interest: Double = 0.0

    override fun cashIn(cash: Int) {
        balance += cash
        interest += cash * percentInterest
        println("После пополнения карты на $cash:")
        println("Собственные средства: $balance.")
        println("Накопления при пополнении: $interest.")
    }

    override fun getAvailFund() {
        println("Собственные средства: $balance.")
        println("Накопления при пополнении: $interest.")
    }
}