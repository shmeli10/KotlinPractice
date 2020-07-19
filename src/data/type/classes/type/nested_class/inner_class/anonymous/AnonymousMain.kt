package data.type.classes.type.nested_class.inner_class.anonymous

fun main(args: Array<String>) {
    var programmer: Human = object:Human {
        override fun think() {
            print("\nI am an example of Anonymous Inner Class\n")
        }
    }
    programmer.think()
}

interface Human {
    fun think()
}