package generics.example2

fun <T> anyToString(value: T): String = value.toString()

class ValueWrapper<T>(val value: T) {
    // #1
    // val valueAsString = value.toString()

    // #2
    val valueAsString = anyToString(value)
}