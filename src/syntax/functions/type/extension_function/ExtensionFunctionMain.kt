package syntax.functions.type.extension_function

import data.type.functional_type.User
import data.type.functional_type.UserBuilder
import data.type.functional_type.buildTestUserOld

// Extension function with receiver
fun UserBuilder.buildTestUser(): User =
        data.type.functional_type.with(this, ::buildTestUserOld)