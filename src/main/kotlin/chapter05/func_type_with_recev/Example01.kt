package chapter05.func_type_with_recev

fun aggregate(numbers: IntArray, op: Int.(Int) -> Int): Int {
    var result = numbers.firstOrNull() ?: throw IllegalArgumentException("Empty Array")

    for (i in 1..numbers.lastIndex) result = op(result, numbers[i])

    return result
}
