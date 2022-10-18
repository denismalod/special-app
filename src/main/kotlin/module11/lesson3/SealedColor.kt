package module11.lesson3

sealed class SealedColor(val hex: String) {
    object White : SealedColor ("#FFF")
    object Black : SealedColor ("#000")
    object Red : SealedColor ("#F00")
    object Green : SealedColor ("#0F0")
    class Blue : SealedColor ("#00F")

    class CustomColor(hex: String) : SealedColor(hex)


}