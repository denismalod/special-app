package module11.practical_work_10_2

sealed class FireType {
    object SingleShoot : FireType()
    data class FireBurst(val size: Int) : FireType()


}