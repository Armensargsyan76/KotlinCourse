package kotlincourse.kotlinBasics

fun main() {

    val deferentCars = mapOf(
        1 to Cars("green ", "Toyota", 2015),
        2 to Cars("black ", "Ford", 2012),
        3 to Cars("red ", "Mercedes", 2019),
        17 to Cars("red", "BMW", 2015),
        8 to Cars("green", "Ford", 2010),
        8 to Cars("green", "Kia", 2016)
    )

    println(deferentCars.asSequence().filter { it.value.model == "Ford" }
        .map { it.value.color })

    listOf("Mary", "Jane", "Joe").asSequence()
        .map { println("mapping $it"); it.toUpperCase() }
        .filter { println("filtering $it"); it[0] == 'J'}
        .toList()
}