package module10.practical_work_9

class EurRub : CurrencyConverter {

    override val currencyCod: String = "EUR"
    override val currentCurrency = 55.93

    override fun convertToRub(rub: Double) {
        println("$rub рублей = ${rub / currentCurrency} $currencyCod ")
    }
}