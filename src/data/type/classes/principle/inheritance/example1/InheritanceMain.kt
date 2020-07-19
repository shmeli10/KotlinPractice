package data.type.classes.principle.inheritance.example1

// can be inherited
open class SingletonParent(var x:Int) {
    fun something(): Unit {
        println("X=$x")
    }
}

object SingletonDerive: SingletonParent(10) {}