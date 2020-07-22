package syntax.functions.type.extension_function

import data.type.functional_type.User
import data.type.functional_type.UserBuilder

fun main() {
    // #1
    println("\nUser: ${getUser()}")

    // #2
    /*val userById = getUserById("")?.apply {
        setName("Test name")
        setAddress("Test address")
        setEmail("Test email")
    }*/

    // #3
    val userById = getUserById("")?.also {
        it.setName("Test name")
        it.setAddress("Test address")
        it.setEmail("Test email")
    }

    /*val userById = getUserById("").apply {
        UserBuilder?.setName("Test name")
        UserBuilder?.setAddress("Test address")
        UserBuilder?.setEmail("Test email")
    }*/

    println("\nUser with no id: ${userById?.build()}")
}

// #1
fun getUser(): User {
    // #1
    // apply()
    /*val userBuilder = UserBuilder().apply {
        setName("Test name")
        setAddress("Test address")
        setEmail("Test email")
    }*/

    // #2
    // also()
    val userBuilder = UserBuilder().also {
        it.setName("Test name")
        it.setAddress("Test address")
        it.setEmail("Test email")
    }
    return userBuilder.build()
}

// #2
fun getUserById(id: String): UserBuilder? {
    return if (id.isEmpty()) return null
    else UserBuilder().apply {
        setName("Test name")
        setAddress("Test address")
        setEmail("Test email")
    }
}