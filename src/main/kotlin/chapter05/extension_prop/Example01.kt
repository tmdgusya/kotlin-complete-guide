package chapter05.extension_prop

val IntRange.leftHalf: IntRange
    get() = start..(start + endInclusive) / 2

fun main() {
    println((1..3).leftHalf)
    println((3..6).leftHalf)
}
