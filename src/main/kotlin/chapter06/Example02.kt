package chapter06

enum class RainbowColor(val isCold: Boolean) {
    RED(false), ORANGE(false), YELLOW(false),
    GREEN(true), BLUE(true), INDIGO(true);

    val isWarm get() = !isCold
}

fun main() {
    println(RainbowColor.BLUE.isCold)
    println(RainbowColor.RED.isWarm)
}
