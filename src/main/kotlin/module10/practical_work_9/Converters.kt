package module10.practical_work_9

object Converters {
    private val currency = listOf(UsdRub(), EurRub(), JpyRub(), GbpRub())

    var checkCod = object : CurrencyConverter {
        override val currencyCod: String = ""
        override val currentCurrency: Double = 1.0
    }

    fun get(currencyCod: String): CurrencyConverter {
         val currencyCod = currencyCod.uppercase()

        checkCod = object : CurrencyConverter {
            override val currencyCod: String = ""
            override val currentCurrency: Double = 1.0
        }

        currency.forEach {
            if (it.currencyCod == currencyCod)
                checkCod = it
        }
        if (checkCod.currencyCod == "") {
            checkCod = object : CurrencyConverter {
                override val currencyCod: String = currencyCod
                override val currentCurrency: Double = 1.0
                override fun convertToRub(rub: Double) {
                    println("$rub рублей = ? $currencyCod ")
                }
            }
        }

        return checkCod
    }


}

