package data.type.classes.operation.extension.example2

interface StudentFactory {
    fun create(name: String): Student
}

class Student private constructor(val name: String) {
    companion object: StudentFactory {
        override fun create(name: String): Student {
            return Student(name)
        }
    }
}