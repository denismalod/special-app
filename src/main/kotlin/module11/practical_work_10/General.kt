package module11.practical_work_10

class General: AbstractWarrior() {
    override val maxHealthLevel: Int = 300
    override val accuracy: Int = 40
    override val weapon: AbstractWeapon = Weapons.createMachineGun()
    override var currentHealthLevel: Int = 300
    override val isKilled: Boolean = false
    override val chanceAvoidDamage: Int = 30
}