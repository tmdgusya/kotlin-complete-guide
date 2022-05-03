package chapter05.high_order_func

fun forEach(a: IntArray, action: (Int) -> Unit) {
    for (n in a) action(n)
}

inline fun forEachWithInline(a: IntArray, action: (Int) -> Unit) {
    for (n in a) action(n)
}

inline fun forEachWithInObject(a: IntArray, crossinline action: (Int) -> Unit) = object {
    fun run() {
        for (n in a) action(n)
    }
}

fun main() {
    forEach(intArrayOf(1, 2, 3, 4)) roachFunction@{
        if (it < 2 || it > 3) return@roachFunction
        println(it)
    }

    forEach(intArrayOf(1, 2, 3, 4)) {
        if (it < 2 || it > 3) return@forEach
        println(it)
    }

    forEachWithInline(intArrayOf(1, 2, 3, 4)) {
        if (it < 2 || it > 3) return
        println(it)
    }
}
