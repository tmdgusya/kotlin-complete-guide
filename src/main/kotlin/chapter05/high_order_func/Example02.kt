package chapter05.high_order_func

fun interface StringConsumer {
    fun accept(s: String)
}

fun measureTime(action: () -> Unit): Long {
    val startTime = System.nanoTime()
    action()
    val endTime = System.nanoTime()

    return endTime - startTime
}

fun nullableMeasureTime(action: (() -> Unit)?): Long {
    val startTime = System.nanoTime()
    action?.invoke()
    val endTime = System.nanoTime()

    return endTime - startTime
}

fun main() {
    val executeTime = measureTime {
        val consume = StringConsumer { s -> println(s) }
        consume.accept("Hello! Kotlin")
    }

    println(executeTime)
}
