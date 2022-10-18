package module3

fun main() {
    val juniorGrossSalary = 50_000
    val middleGrossSalary = 134_000
    val seniorGrossSalary = 167_000
    calculateSavings(salary = juniorGrossSalary, rate = 0.1, months = 10)
    calculateSavings(middleGrossSalary, 0.4)
    calculateSavings(seniorGrossSalary)

    val sum = calculateSavings(3000, 0.12, 8) +
            calculateSavings(55000, 0.20, 8)
    println(sum)

    val first = calculateSavings(3000, 0.12, 8) { _, _, _, bank ->
        println("First member's bank: $bank")
    }
    val second = calculateSavings(55000, 0.20, 8, printInfo = { _, _, _, bank ->
        println("First member's bank: $bank")
    })
    println(first + second)

    val third = calculateSavings(50000, 0.30, 12, printInfo = { salary, rate, months, bank ->
        println("Salary: $salary, rate: ${rate * 100}%, period: $months, bank: $bank")
    })


}

fun calculateSavings(
    salary: Int,
    rate: Double = 0.3,
    months: Int = 12,
    printInfo: ((salary: Int, rate: Double, months: Int, bank: Double) -> Unit)? = null
): Double {
    val netSalary = salary * 0.87
    val bank = netSalary * rate * months
    printInfo?.invoke(salary, rate, months, bank)
    // println ("Salary: $salary, rate: ${rate*100}%, period: $months person can accumulate, $bank ")
    return bank

}