package module9.lesson2

class Zeppelin: Aircraft(1990) {
    override val brand: String = "Zeppelin"
    override val model: String = "NT"
    override val engineCount: Int = 3
    override val altitude: Int = 2600
    override val rows: Int = 1
    override val numberOfSeatsInARow: Int = 12


    override fun getSeatScheme() {
        val seats = seatScheme.first().map {
            if(it == null)
                "_"
            else
                "X"
        }
        val scheme = """
                ${seats[0]} ${seats[1]}
               ${seats[2]}    ${seats[3]}
              ${seats[4]}      ${seats[5]}  
             ${seats[6]}        ${seats[9]}  
             ${seats[7]}        ${seats[10]}
             ${seats[8]}        ${seats[11]}                 
        """.trimIndent()
        println(scheme)



    }

    override val capacity: Int = 12


}