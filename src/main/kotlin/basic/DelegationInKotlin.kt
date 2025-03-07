package basic

import kotlin.properties.Delegates

fun main() {
   val adminUser = AdminUser()

    println(SudoUser(adminUser).saveUser("Sudo C"))

    println()

    adminUser.name = "Sudo Sudo"

    println(SudoUser(adminUser).saveUser("Sudo Sudo C"))
}

interface User {
    var name: String
    val fingerprintArray: Array<String>
    fun getProfile(): User
}


class AdminUser constructor() : User {

    constructor(id: String, department: String) : this()

    override var name: String by Delegates.observable("No Name") { _, old, new ->
        println("Name changed from $old to $new")
    }


    override val fingerprintArray: Array<String>
        get() = arrayOf<String>("", "")

    override fun toString(): String {
        return " name = ${this.name}, " +
//                " department = ${this.department}, " +
                " fingerprintArray = ${this.fingerprintArray}"
    }

    override fun getProfile(): User {
//        val adminUser = AdminUser()
//        println(adminUser.toString())
        return this

    }

    fun printAdmin() {

    }

}

class SudoUser(private val user: User) : User by user {

    fun saveUser(user: String) {

        println("User $user saved to database")

        println("User ${getProfile()} saved") // delegating getProfile
    }
}