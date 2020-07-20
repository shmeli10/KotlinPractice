package data.type.classes.type.regular_class.example2

import data.type.classes.operation.extension.example2.Student
import data.type.classes.type.singleton_class.example4.SingletonDerive
import data.type.classes.type.singleton_class.example1.Singleton
import syntax.method.example1.showFirstCharacter

fun main(args: Array<String>) {
    println("First letter:" + showFirstCharacter("Kotlin is cool!"))

    Singleton.doSomething()
    Singleton.doSomething()

    SingletonDerive.something()

    Student.create("Jack Wallace")
}