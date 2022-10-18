package module11.practical_work_10_2

object Weapons {

    fun createPistol(): AbstractWeapon {
        return Pistol()
    }

    fun createAutomatic(): AbstractWeapon {
        return Automatic()
    }

    fun createMachineGun(): AbstractWeapon {
        return MachineGun()
    }
}