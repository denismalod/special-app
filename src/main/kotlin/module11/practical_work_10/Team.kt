package module11.practical_work_10

class Team {
    private var team: MutableList<AbstractWarrior> = mutableListOf()
    private val numberWorriers: Int = 10

    fun createTeam(): MutableList<AbstractWarrior>{
        val general= General()
        val captain= Captain()
        val soldier= Soldier()

        for (i in 1..numberWorriers) {
            when ((1..10).random()) {
                1 -> team.add(general)
                2,3,4 -> team.add(captain)
                5,6,7,8,9,10 -> team.add(soldier)
            }
        }
        return team
    }

}