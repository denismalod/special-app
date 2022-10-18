package module10.practical_work_9

class GbpRub : CurrencyConverter {
    override val currencyCod: String = "GBP"
    override val currentCurrency = 62.97

    override fun convertToRub(rub: Double) {
        println("$rub рублей = ${rub / currentCurrency} $currencyCod ")
    }
}