package kotlincourse.kotlinBasics

import javapackage.DummyClass

fun main() {

    val myInt = 10
    var myLong = 22L

    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()

    var myDouble = 65.984
    println(myDouble is Double)

    val myFloat = 838.548f
    println("This is float: ${myFloat is Float}")

    myDouble = myFloat.toDouble()

    val char = 'b'
    val myCharInt = 65
    println(myCharInt.toChar())

    val myBoolean = true;

    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)
}