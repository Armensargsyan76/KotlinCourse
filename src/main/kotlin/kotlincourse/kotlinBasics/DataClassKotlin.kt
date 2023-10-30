package kotlincourse.kotlinBasics

fun main() {

    val car = Car("blue", "Toyota", 1998)
    println(car)
    val car2 = Car("blue", "Toyota", 1998)
    println(car == car2)
    val car3 = car.copy()
    println(car3)
    val car4 = car.copy(year = 2000, color = "green")
}

data class Car(var color: String, val model: String, val year: Int)