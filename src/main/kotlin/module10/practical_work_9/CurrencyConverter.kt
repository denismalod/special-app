package module10.practical_work_9

interface CurrencyConverter  {

    val currencyCod: String
    val currentCurrency: Double
    fun convertToRub (rub: Double){
        println("$rub рублей = ${rub / currentCurrency} $currencyCod ")
    }

}