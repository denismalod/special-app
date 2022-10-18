package module11.practical_work_10_2

class Pistol : AbstractWeapon() {
    override val maxNumberPatrons: Int = 30

    override val fireType = FireType.SingleShoot

    override var magazine = Stack<Ammo>()

    override var magazineIsNotEmpty: Boolean = false


    override fun createPatron() {
        magazine.push(Ammo.PistolPatron)
    }

//    override fun reload() {
//        for (i in 1..maxNumberPatrons) createPatron()
//        magazineIsNotEmpty = true
//
//    }

//    override fun getPatronForFire(): Ammo? {
//        val patron = magazine.pop()
//        if (magazine.isEmpty()) magazineIsNotEmpty = false
//        return patron
//    }


}