package module11.practical_work_10_2

abstract class AbstractWeapon {

    abstract val maxNumberPatrons: Int
    abstract val fireType: FireType
    abstract var magazine: Stack<Ammo>
    abstract var magazineIsNotEmpty: Boolean


    abstract fun createPatron()

    fun reload() {
        for (i in 1..maxNumberPatrons) createPatron()
        magazineIsNotEmpty = true
    }

    fun getPatronForFire(numPatrons: Int): Ammo? {
        if (numPatrons > magazine.patronsLeft())
            throw NoAmmoException()
        val patron = magazine.pop()
        if (magazine.isEmpty()) magazineIsNotEmpty = false
        return patron
    }

}

class NoAmmoException : Exception()