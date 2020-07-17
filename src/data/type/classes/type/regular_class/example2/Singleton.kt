package data.type.classes.type.regular_class.example2

object Singleton {
    private var count = 0

    fun doSomething():Unit {
        println("Calling doSomething (${++count} call/-s in total)")
    }
}

open class SingletonParent(var x:Int) {
    fun something():Unit {
        println("X=$x")
    }
}

object SingletonDerive: SingletonParent(10) {}