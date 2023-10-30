package kotlincourse.kotlinBasics

import java.lang.NumberFormatException

fun main() {

    println(getNumber("22.5") ?: "I can`t print the result")
}

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    }
}