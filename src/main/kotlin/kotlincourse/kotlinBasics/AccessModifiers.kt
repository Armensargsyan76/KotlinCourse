package kotlincourse.kotlinBasics

fun main() {
    val emp = Employee("John")
    println(emp.firstName)

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee("Jane", false)
    println(emp3.firstName)
    println(emp3.fullTime)
}

private class Employee(val firstName: String, var fullTime: Boolean = true) {

}