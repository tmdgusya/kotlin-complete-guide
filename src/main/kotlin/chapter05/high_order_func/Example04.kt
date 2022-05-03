package chapter05.high_order_func

class Person(val firstName: String, val familyName: String) {
    fun hasNameOf(name: String) = name.equals(firstName, ignoreCase = true)
}

fun main() {
    val createPerson = ::Person // 호출 가능 참조 획득
    createPerson("John", "Doe")

    val isJohn = Person("John", "Doe")::hasNameOf

    println(isJohn("Roach")) // false
    println(isJohn("John")) // true
}
