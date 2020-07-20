package syntax.method

import data.type.enums.example1.MaritalStatusEnum
import data.type.enums.example1.SexEnum
import syntax.operators.when_operator.honorify

fun buildGreeting(info: Array<String>):String {
    val firstName = getFirstName(info) ?: "John"
    val lastName = getLastName(info) ?: "Doe"
    val maritalStatus = getMaritalStatus(info) ?: MaritalStatusEnum.Unknown
    val sex = guessSex(info) ?: SexEnum.NonBinary

    return ("Hello, ${honorify(sex, maritalStatus)} " +
            "${shorten(firstName) } $lastName")
}