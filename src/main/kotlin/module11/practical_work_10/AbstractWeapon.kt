package module11.practical_work_10

abstract class AbstractWeapon {

    abstract val maxNumberPatrons: Int
    abstract val fireType: FireType
    abstract var magazine: Stack<Ammo>
    abstract var magazineIsNotEmpty: Boolean


    abstract fun createPatron()
    abstract fun reload()
    abstract fun getPatronForFire() : Ammo?

//    fun numShoots(e: FireType): Int =
//        when (e) {
//            FireType.SingleShoot -> 1
//            is FireType.FireBurst -> e.size
//        }




}