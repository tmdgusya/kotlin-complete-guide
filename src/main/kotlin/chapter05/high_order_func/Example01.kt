package chapter05.high_order_func

fun sum(numbers: IntArray): Int {
    var result = numbers.firstOrNull() ?: throw IllegalArgumentException("Empty Array")

    for (i in 1..numbers.lastIndex) result += numbers[i]

    return result
}

/**
 * This code writing is only Last Parameter Type is lambda
 */
fun sumWithAggregate(numbers: IntArray): Int {
    return aggregate(numbers) { result, op -> result + op }
}

fun max(numbers: IntArray): Int {
    return aggregate(numbers) {
            result, op ->
        if (op > result) op else result
    }
}

fun aggregate(numbers: IntArray, op: (Int, Int) -> Int): Int {
    val result = numbers.firstOrNull() ?: throw IllegalArgumentException("Empty Array")

    for (i in 1..numbers.lastIndex) op(result, numbers[i])

    return result
}

fun main() {
    val given = intArrayOf(1, 2, 3, 4, 5)

    println(sum(given))

    println(sumWithAggregate(given))

    println(max(given))
}
