package module11.practical_work_10

enum class Ammo(
    private val damage: Int,
    private val chanceCriticDamage: Int,
    private val multCriticDamage: Int
) {
    PistolPatron(8, 15, 2),
    AutomaticPatron(20, 21, 3),
    GunPatron(30, 26, 3);

    fun getCurrentDamage(): Int {
        return if (chanceCriticDamage.chance())
            (damage * multCriticDamage)
        else
            damage
    }
}
