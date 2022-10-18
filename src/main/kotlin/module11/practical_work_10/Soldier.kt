package module11.practical_work_10

class Soldier: AbstractWarrior() {
    override val maxHealthLevel: Int = 120
    override val accuracy: Int = 15
    override val weapon: AbstractWeapon = Weapons.createPistol()
    override var currentHealthLevel: Int = 120
    override val isKilled: Boolean = false
    override val chanceAvoidDamage: Int = 15
}