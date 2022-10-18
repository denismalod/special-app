package module11.practical_work_10

abstract class AbstractWarrior : Warrior {
    abstract val maxHealthLevel: Int
    abstract val accuracy: Int
    abstract val weapon: AbstractWeapon
    abstract var currentHealthLevel: Int

    override fun attack(enemy: Warrior) {
        var damage = 0
        var patron: Ammo
        for (i in 1..numShoots(weapon.fireType)) {
            if (weapon.magazineIsNotEmpty) {
                patron = weapon.getPatronForFire()!!
                val chanceDamage: Int = (100 - enemy.chanceAvoidDamage) * accuracy / 100
                if (chanceDamage.chance()) {
                    damage += patron.getCurrentDamage()
                }

            } else {
                weapon.reload()
                break
            }
        }
        enemy.getDamage(damage)
    }

    override fun getDamage(damage: Int) {
        currentHealthLevel = maxOf(0, currentHealthLevel - damage)
    }


}