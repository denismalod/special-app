package module11.practical_work_10_2

class Captain: AbstractWarrior() {
    override val maxHealthLevel: Int = 200
    override val accuracy: Int = 30
    override val weapon: AbstractWeapon = Weapons.createAutomatic()
    override var currentHealthLevel: Int = 200
    override val isKilled: Boolean = false
    override val chanceAvoidDamage: Int = 25

}