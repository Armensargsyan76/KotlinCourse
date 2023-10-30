package kotlincourse.kotlinclasses

fun main() {
    val laserPrinter = LaserPrinter("lalala", 22)
    laserPrinter.printModel()
}

abstract class Printer(val modelName: String) {

    open fun printModel() = println("The model name of this printer ia $modelName")
    abstract fun bestSellingPrice(): Double

}

open class LaserPrinter(modelName: String, ppm: Int) : Printer(modelName) {

    override fun printModel() = println("The model name of this laser printer ia $modelName")
    override fun bestSellingPrice(): Double = 129.99
}

class SpecialLaserPrinter(modelName: String, ppm: Int) : LaserPrinter(modelName, ppm) {

    override fun printModel() = println("this is my way of doing it")
}

open class Something: MySubInterface{

    val someProperty: String
    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }

    override val number: Int = 25
    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }

    constructor(someParameter: String) {
        someProperty = someParameter
    }
}

class SomethingElse : Something {

    constructor(someOtherParameter: String) : super(someOtherParameter)

    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }
}

interface MyInterface {

    val number: Int

    fun myFunction(str: String): String

}

interface MySubInterface : MyInterface {

    fun mySubFunction(num: Int): String

}