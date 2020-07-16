package syntax.operators.elvis_operator

import syntax.method.getFirstName
import syntax.method.getLastName

fun main(args: Array<String>) {
    val firstName = getFirstName(args) ?: "John"
    val lastName = getLastName(args) ?: "Malkovich"
    println("Hello, $firstName $lastName")
}