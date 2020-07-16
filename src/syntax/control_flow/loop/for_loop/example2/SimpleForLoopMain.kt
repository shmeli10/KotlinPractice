package syntax.control_flow.loop.for_loop.example2

fun main(args: Array<String>) {
    val items = listOf(1, 22, 83, 4)

    println("Integer array:")
    for (i in items) println("item: $i")


    // #1
    println("\n#1_Integer array(with index):")
    for ((index, value) in items.withIndex()) {
        println("item[$index]: $value")
    }

    // #2
    println("\n#2_Integer array(with index):")
    for (index in items.indices) {
        println("item[$index]: ${items[index]}")
    }

    println("\nChar array:")
    val string = "print my characters"
    for (char in string) {
        println(char)
    }
}