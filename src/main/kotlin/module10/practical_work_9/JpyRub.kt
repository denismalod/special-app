package module10.practical_work_9

class JpyRub : CurrencyConverter {
    override val currencyCod: String = "JPY"
    override val currentCurrency = 0.4028

    override fun convertToRub(rub: Double) {
        println("$rub рублей = ${rub / currentCurrency} $currencyCod ")
    }
}