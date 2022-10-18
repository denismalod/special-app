package module10.practical_work_9

class UsdRub : CurrencyConverter {

    override val currencyCod: String = "USD"
    override val currentCurrency = 58.1

    override fun convertToRub(rub: Double) {
        println("$rub рублей = ${rub / currentCurrency} $currencyCod ")
    }
}