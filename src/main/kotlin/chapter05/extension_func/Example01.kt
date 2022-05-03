package chapter05.extension_func

fun String.truncate(maxLength: Int): String {
    return if (length <= maxLength) this else substring(0, maxLength)
}

fun main() {
    println("Hello!!".truncate(5))
}
