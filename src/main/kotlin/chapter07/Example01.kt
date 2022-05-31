package chapter07

fun main() {
    println(sequenceOf(1, 2, 3).iterator().next())

    val numbers = sequence<Int> {
        yield(0)
        yieldAll(listOf(1, 2, 3))
    }

    println(numbers.toList())
}
