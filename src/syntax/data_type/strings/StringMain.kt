package syntax.data_type.strings

fun main(array: Array<String>) {
    val regularString = "This \"string\" \be funky"
    println("Regular string $regularString")

    val rawString = """
        This awesome "string" \should
        be printed as-is"""
    println("Raw string $rawString")

    val dollarString = """
        ${'$'}tring templates shall not pass!"""
    println("Dollar string $dollarString")
}