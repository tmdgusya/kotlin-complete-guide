package chapter06

class Person(
    val firstName: String,
    val familyName: String,
    val age: Int
)

data class DataPerson(
    val firstName: String,
    val familyName: String,
    val age: Int
)

fun main() {
    val person1 = Person("John", "Doe", 25)
    val person2 = Person("John", "Doe", 25)
    val person3 = person1

    println(person1 == person2) // false
    println(person1 === person3) // true diff address equality
    println(person1 == person3) // true call `equals`

    val dataPerson1 = DataPerson("John", "Doe", 25)
    val dataPerson2 = DataPerson("John", "Doe", 25)
    val dataPerson3 = dataPerson1

    println(dataPerson1 == dataPerson2) // true
    println(dataPerson1 === dataPerson3) // true diff address equality
    println(dataPerson1 == dataPerson3) // true call `equals`

    println("Original = $dataPerson1") // original
    println("Copy And Changed = ${dataPerson1.copy(firstName = "roach")}")

    val (firstName, familyName, age) = dataPerson1

    println("firstName = $firstName, familyName = $familyName, age = $age")
}
