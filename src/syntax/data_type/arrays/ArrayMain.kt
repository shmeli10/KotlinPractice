package syntax.data_type.arrays

fun main(array: Array<String>) {
    // that will work in Java but not in Kotlin
    /*  final String[] oops = {"only", "strings", "here"};
        final Object[] yeah = oops;
        yeah[1] = 42;
    */

    val fibs = arrayOf(1, 1, 2, 3, 5, 8, 13)
    val sqrt = Array(7) {i -> i*i}
    val fastFibs = intArrayOf(1, 1, 2, 3, 5, 8, 13)

}