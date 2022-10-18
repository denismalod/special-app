package module12

fun main() {
    val admin = Account(123456, AccountType.ADMIN)
    Server.dropDatabase(admin)

    val user = Account(123456, AccountType.USER)
    Server.dropDatabase(user)



}
class AccessRestrictedException : Throwable(message = "You have no rights to perform this operation")

object Server{
    fun dropDatabase(user: Account) {
        when (user.type) {
            AccountType.ADMIN -> println("Are you sure you want to drop database?")
            else -> throw AccessRestrictedException()
        }
    }
}

class Account(
    val id: Int,
    val type: AccountType
)

enum class AccountType {
    ADMIN, USER
}