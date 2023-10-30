package kotlincourse.kotlinBasics

import java.math.BigDecimal

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main() {

    val timeOfYear = Season.WINTER

    val str = when (timeOfYear) {
        Season.SPRING -> "laala"
        Season.SUMMER -> "lululu"
        Season.FALL -> "laaaaa"
        Season.WINTER -> "luuuuu"
    }
    println(str)

    val num = 150

    when (num) {
        in 100..199 -> println("600")
        200 -> println("200")
        300 -> println("300")
        else -> println("lalalalla")
    }

    val y = 10

    when (num) {
        y + 80 -> println("600")
        y + 140 -> println("200")
        300 -> println("300")
        else -> println("lalalalla")
    }

    val obj: Any = "I`m a string"
    val obj2: Any = BigDecimal(25.2)
    val obj3: Any = 45

    val something: Any = obj2

    val z = when (something) {
        is String -> {
            println(something.toUpperCase())
            1
        }

        is BigDecimal -> {
            println(something.remainder(BigDecimal(10.5)))
            2
        }

        is Int -> {
            println("${something - 22}")
            3
        }

        else -> println("I have no idea")
    }
    println(z)


}