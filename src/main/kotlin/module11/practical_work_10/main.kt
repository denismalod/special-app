package module11.practical_work_10


import kotlin.random.Random

fun main() {
    val battle = Battle()

    battle.doBattleIteration()


}

fun Int.chance(): Boolean {
    val random = Random.nextInt(1, 100)
    return random >= 1 && random <= this


}

fun numShoots(e: FireType): Int =
    when (e) {
        FireType.SingleShoot -> 1
        is FireType.FireBurst -> e.size
    }
