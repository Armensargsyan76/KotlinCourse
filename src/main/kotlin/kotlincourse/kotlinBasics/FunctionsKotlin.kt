package kotlincourse.kotlinBasics

fun main() {

    println(labelMultiply(3, 4, "The result is:"))

    val car = Car("blue", "Toyota", 1998)
    println(car)
    val car2 = Car("blue", "Toyota", 1998)
    println(car == car2)
    val car3 = car.copy()
    println(car3)
    val car4 = car.copy(year = 2000, color = "green")

//    printColors(car, car2, car4, car3, str = "lalalala")

    val manyCars = arrayOf(car, car2, car3)
    printColors(*manyCars)

    val moreCars = arrayOf(car, car2)
    val car5 = car.copy()
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car5)
    for (c in lotsOfCars)
        println(c)
}

fun printColors(vararg cars: Car){
    for (car in cars){
        println(car.color)
    }
}

fun labelMultiply(operand1: Int, operand2: Int, label: String) = ("$label ${operand1 * operand2}")

