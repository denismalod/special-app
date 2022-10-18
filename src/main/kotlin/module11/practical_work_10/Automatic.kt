package module11.practical_work_10

class Automatic: AbstractWeapon() {
    override val maxNumberPatrons: Int = 30

    override val fireType: FireType = FireType.FireBurst(3)

    override var magazine = Stack<Ammo>()

    override var magazineIsNotEmpty: Boolean = false


    override fun createPatron() {
        magazine.push(Ammo.AutomaticPatron)
    }

    override fun reload() {
        for (i in 1..maxNumberPatrons) createPatron()
        magazineIsNotEmpty = true
    }

    override fun getPatronForFire(): Ammo? {
        val patron = magazine.pop()
        if (magazine.isEmpty()) magazineIsNotEmpty = false
        return patron
    }
}