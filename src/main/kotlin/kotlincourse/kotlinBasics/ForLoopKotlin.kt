package kotlincourse.kotlinBasics

fun main() {

    val range = 1..5
    for (i in range) {
        println(i)
    }

    for (n in 1..5) {
        println(n)
    }

    val charRange = 'a'..'z'
    println('c' in charRange)

    val hello = "Hello"
    for (c in hello) {
        println(c)
    }

    for (num in 1..20 step 4) {
        println(num)
    }

    for (i in 20 downTo 15) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    val seasons = arrayOf("spring", "summer", "winter", "fall")
    for (season in seasons) {
        println(season)
    }

    val notASeason = "whatever" !in seasons
    println(notASeason)
    for (index in seasons.indices) {
        println("${seasons[index]} is seasons number $index")
    }

    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value -> println("$value is season number $index") }

}