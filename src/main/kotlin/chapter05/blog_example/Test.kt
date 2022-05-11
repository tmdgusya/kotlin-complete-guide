package chapter05.blog_example

interface Roach {
    fun roa()
}

class Test(
    val testProperty: String,
) {

    fun test() {
        object : Roach {
            override fun roa() {
                // testProperty 에 접근하고 싶음
                println(this@Test.testProperty)
            }
        }
    }
}
