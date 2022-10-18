package module11.practical_work_10

sealed class BattleState {
    object Progress : BattleState() {
        fun printProgress(aliveTeam1: Int, aliveTeam2: Int, move: Int) {
            println("после $move хода: ")
            println("в первой команде в живых $aliveTeam1 человек ")
            println("во второй команде в живых $aliveTeam2 человек ")
            println("----------------------------------------------")
        }
    }

    object WinOne : BattleState() {
        fun printWinOne() {
            println("В битве победила первая команда")
        }
    }

    object WinTwo : BattleState() {
        fun printWinTwo() {
            println("В битве победила вторая команда")
        }
    }

    object Draw : BattleState() {
        fun printDraw() {
            println("Результат битвы: ничья")
        }
    }

}