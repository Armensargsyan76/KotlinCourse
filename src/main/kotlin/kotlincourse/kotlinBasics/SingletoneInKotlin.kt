package kotlincourse.kotlinBasics

import java.time.Year

fun main() {
    println(SingletonInKotlin.currentYear)
    println(SomeClass.accessPrivateVar())
}

object SingletonInKotlin {

    var currentYear = Year.now().value

}

class SomeClass{

    companion object {
        private var privateVar = 6

        fun accessPrivateVar() = "I1m accessing privateVar: $privateVar"
    }
}