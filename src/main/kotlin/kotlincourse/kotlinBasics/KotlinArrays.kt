package kotlincourse.kotlinBasics

import javapackage.DummyClass
import java.math.BigDecimal

fun main() {

    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3)

    val longs3 = arrayOf(1, 2, 3, 4)

    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)

    println(longs2[2])

    val evenNumbers = Array(16) { i -> i * 2 }

//    for (number in evenNumbers) {
//        println(number)
//    }

    val lotsOfNumbers = Array(100000) { i -> i + 1 }

    val allZeroes = Array(100) { 0 }

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    for (number in someArray) {
        println(number)
    }
    someArray = Array(6) { i -> (i + 1) * 10 }
    for (number in someArray) {
        println(number)
    }

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    for (element in mixedArray) {
        println(element)
    }

    println(mixedArray.isArrayOf<Any>())

    val myIntArray = intArrayOf(3, 9, 435, 2, 31)

    DummyClass().printNumbers(myIntArray)

    var someOtherArray = IntArray(5)
    for (number in someOtherArray) {
        println(number)
    }
}