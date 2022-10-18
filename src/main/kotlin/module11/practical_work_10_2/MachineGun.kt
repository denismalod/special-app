package module11.practical_work_10_2

class MachineGun : AbstractWeapon() {
    override val maxNumberPatrons: Int = 100

    override val fireType: FireType = FireType.FireBurst(6)

    override var magazine = Stack<Ammo>()

    override var magazineIsNotEmpty: Boolean = false


    override fun createPatron() {
        magazine.push(Ammo.GunPatron)
    }

//    override fun reload() {
//        for (i in 1..maxNumberPatrons) createPatron()
//        magazineIsNotEmpty = true
//    }

//    override fun getPatronForFire(): Ammo? {
//        val patron = magazine.pop()
//        if (magazine.isEmpty()) magazineIsNotEmpty = false
//        return patron
//    }
}