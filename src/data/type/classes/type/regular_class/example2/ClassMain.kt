package data.type.classes.type.regular_class.example2

fun main(args: Array<String>) {
    println("First letter:" + showFirstCharacter("Kotlin is cool!"))

    Singleton.doSomething()
    Singleton.doSomething()

    SingletonDerive.something()

    Student.create("Jack Wallace")
}