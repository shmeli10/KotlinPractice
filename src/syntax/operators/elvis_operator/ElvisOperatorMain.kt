package syntax.operators.elvis_operator

import syntax.method.example1.getFirstName
import syntax.method.example1.getLastName

fun main(args: Array<String>) {
    val firstName = getFirstName(args) ?: "John"
    val lastName = getLastName(args) ?: "Malkovich"
    println("Hello, $firstName $lastName")
}