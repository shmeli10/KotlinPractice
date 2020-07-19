package data.type.classes.type.nested_class.inner_class

fun main(args: Array<String>) {
    val demo = Outer().Nested().foo()
    print(demo)
}

class Outer {
    private val welcomeMessage: String = "\nWelcome to the TutorialsPoint.com\n"
    inner class Nested {
        fun foo() = welcomeMessage
    }
}