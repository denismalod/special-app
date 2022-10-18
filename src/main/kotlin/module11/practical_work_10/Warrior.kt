package module11.practical_work_10

interface Warrior {
    val isKilled: Boolean
    val chanceAvoidDamage: Int

    fun attack(enemy: Warrior)

    fun getDamage(damage: Int)
}