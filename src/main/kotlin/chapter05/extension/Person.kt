package chapter05.extension

class Address(val city: String, val street: String, val house: String)

class Person(
    val firstName: String,
    val familyName: String
) {

    fun Address.post(message: String) {
        // Address city property
        val city = city
        // Address city property
        val street = this.city
        // Address house property
        val house = this@post.house
        // Person firstName Property
        val firstName = firstName
        // Person familyName Property
        val familyName = this@Person.familyName

        println("From $firstName, $familyName at $city, $street, $house: ")
        println(message)
    }
}
