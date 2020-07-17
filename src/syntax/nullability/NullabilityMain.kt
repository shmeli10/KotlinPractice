package syntax.nullability

fun main() {
    val nullString = null
    val valuedString = "Test"

    println("The first letter of the string:" +
            "\n\t\"nullString\" is: ${shorten(nullString)}" +
            "\n\t\"valuedString\" is: ${shorten(valuedString)}"
    )
}

fun shorten(name: String?): String =
        if (true == name?.isNotEmpty()) name!!.get(0) + "."
        else ""