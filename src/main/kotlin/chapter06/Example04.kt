package chapter06

@JvmInline
value class Dollar(val amount: Int)

@JvmInline
value class Euro(val amount: Int)

@JvmInline
value class InlineDollar(val amount: Int) {
    fun add(d: InlineDollar) = InlineDollar(amount + d.amount)
    val isDebt get() = amount < 0
}

fun main() {
    println(InlineDollar(50).add(InlineDollar(20)).amount)
    println(InlineDollar(-100).isDebt)
    var a: List<Int> = listOf<Int>(1, 2, 3)
    val c = a
    val b: MutableList<Int> = mutableListOf(4, 5, 6, 7)
    a = b.map {
        it + 1
    }
    println(a) // [5, 6, 7, 8]
    println(c) // [1, 2, 3]

    var test: List<Int> = listOf(1, 2, 3)

    if (test is MutableList<Int>) {
        test.add(3)
    }

    println(test)
}
