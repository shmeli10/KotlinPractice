package data.type.classes.type.regular_class.example2

fun showFirstCharacter(input:String):Char {
    if (input.isEmpty()) throw IllegalArgumentException()
    return input.first()
}