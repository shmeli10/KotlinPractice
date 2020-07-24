package generics.example2

// #1
/*
fun main(args: Array<String>) {
    var elems: List<Any> = getItems()   // List<Item>
    elems = elems inject getAds()       // List<Ad>
    // Does not work
    // List<Any> is not a supertype of List<Ad>
}

class List<T> { ... }

inline fun <E> List<E>.inject(other: List<E>): List<E> {
    var res = listOf<E>()
    res += this.slice(0..this.size / 2)
    res += other
    res += this.slice(this.size / 2 + 1..this.lastIndex)
    return res
}
*/