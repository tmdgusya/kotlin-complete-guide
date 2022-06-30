package chapter11

operator fun String.times(n: Int) = repeat(n)

fun main() {
    val result = mutableListOf(1, 2)
    result += listOf(10, 20, 30) // plusAssign
    result += 10 // plusAssign
}
