package syntax.method

// static functions
fun showFirstCharacter(input:String):Char {
    if (input.isEmpty()) throw IllegalArgumentException()
    return input.first()
}