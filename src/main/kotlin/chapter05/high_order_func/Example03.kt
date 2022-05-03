package chapter05.high_order_func

import java.lang.Character.isUpperCase

fun check(s: String, condition: (Char) -> Boolean): Boolean {
    for (c in s) {
        if (!condition(c)) return false
    }
    return true
}

fun main() {

    println(
        check("hello") {
            it.isUpperCase()
        }
    )

    println(check("Hello", ::isUpperCase))
}
