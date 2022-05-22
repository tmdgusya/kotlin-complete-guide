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
}
