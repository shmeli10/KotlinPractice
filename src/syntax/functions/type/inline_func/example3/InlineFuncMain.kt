package syntax.functions.type.inline_func.example3

import data.type.functional_type.User

fun main() {

    // #1
    val person1 = Person()
    person1.name = "Test User#1"
    person1.age = 18
    println("\nName: ${person1.name}")
    println("Age: ${person1.age}")

    // #2
    // with(receiver)
    // Use "with()" only on "non-nullable receivers", and when you don’t need its result.
    val person2 = Person()
    with(person2) {
        name = "Test User#2"
        age = 18
        println("\nName: $name")
        println("Age: $age")
    }

    // #3
    // also()
    // Use the "also()" function, if your block does not access its "receiver" parameter at all, or if it does not
    // mutate its "receiver" parameter.
    // Don’t use "also()" if your block needs to return a different value.
    val person3: Person = getPerson().also {
        print(it.name)
        print(it.age)
    }

    // apply()
    // Use the "apply()" function if you are not accessing any functions of the "receiver" within your "block", and
    // also want to return the same "receiver".
    // This is most often the case when initializing a new object.
    val peter = Person().apply {
        // only access properties in apply block!
        name = "Peter"
        age = 18
    }

    // let()
    // Use the "let()" function in either of the following cases:
    //      * execute code if a given value is not "null"
    //		* convert a "nullable object" to another "nullable object"
    //		* limit the scope of a single local variable
    /*getNullablePerson()?.let {
        // only executed when not-null
        promote(it)
    }

    val driversLicence: Licence? = getNullablePerson()?.let {
        // convert nullable person to nullable driversLicence
        licenceService.getDriversLicence(it)
    }

    val person4: Person = getPerson()
    getPersonDao().let { dao ->
        // scope of dao variable is limited to this block
        dao.insert(person4)
    }*/

    // run()
    // Use "run()" function if you:
    //      * need to compute some value or want to limit the scope of multiple local variables.
    //      * want to convert "explicit parameters" to "implicit receiver".
    /*val inserted: Boolean = run {
        val person5: Person = getPerson()
        val personDao: PersonDao = getPersonDao()
        personDao.insert(person5)
    }

    fun printAge(person: Person) = person.run {
        print(age)
    }*/


}

fun getPerson(): Person {
    val person = Person()
    person.name = "Test User#2"
    person.age = 18
    return person
}

/*private fun insert(user: User) = SqlBuilder().apply {
        append("INSERT INTO user (email, name, age) VALUES ")
        append("(?", user.email)
        append(",?", user.name)
        append(",?)", user.age)
    }.also {
        print("Executing SQL update: $it.")
    }.run {
        jdbc.update(this) > 0
    }*/

class Person {
    var name: String? = null
    var age: Int? = null
}

