package chapter05.high_order_func

fun sum(numbers: IntArray): Int {
    var result = numbers.firstOrNull() ?: throw IllegalArgumentException("Empty Array")

    for (i in 1..numbers.lastIndex) result += numbers[i]

    return result
}

fun main() {
    println(sum(intArrayOf(1, 2, 3, 4, 5)))
}
