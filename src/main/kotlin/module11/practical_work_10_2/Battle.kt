package module11.practical_work_10_2


class Battle {

    private var team1 = Team().createTeam()
    private var team2 = Team().createTeam()
    private var battleOver = false
    private var numberMoves = 10


    private fun getBattleState(move: Int) {
        var aliveTeam1 = 0
        var aliveTeam2 = 0


        team1.forEach {
            if (it.currentHealthLevel > 0) aliveTeam1++
        }
        team2.forEach {
            if (it.currentHealthLevel > 0) aliveTeam2++
        }

        BattleState.Progress.printProgress(aliveTeam1, aliveTeam2, move)

        if (move == numberMoves && aliveTeam1 == aliveTeam2)
            BattleState.Draw.printDraw()
        else if (aliveTeam2==0 || ((move == numberMoves) && (aliveTeam1 > aliveTeam2) )) {
            BattleState.WinOne.printWinOne()
            battleOver = true
        } else if (aliveTeam1==0 || ((move == numberMoves) && (aliveTeam2 > aliveTeam1) )) {
            BattleState.WinTwo.printWinTwo()
            battleOver = true
        }


    }

    fun doBattleIteration() {
        var shufTeam1: MutableList<AbstractWarrior>
        var shufTeam2: MutableList<AbstractWarrior>



        for (move in 1..numberMoves) {
            shufTeam1 = team1.shuffled() as MutableList<AbstractWarrior>
            shufTeam2 = team2.shuffled() as MutableList<AbstractWarrior>
            for (i in 0 until team1.size) {
                if (shufTeam1[i].currentHealthLevel > 0) shufTeam1[i].attack(shufTeam2[i])
                //println("$i 2-" + shufTeam2[i].currentHealthLevel)
                if (shufTeam2[i].currentHealthLevel > 0) shufTeam2[i].attack(shufTeam1[i])
                //println("$i 1-" + shufTeam1[i].currentHealthLevel)
            }
            getBattleState(move)
            if (battleOver) break
        }

    }

}