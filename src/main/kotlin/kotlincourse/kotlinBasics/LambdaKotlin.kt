package kotlincourse.kotlinBasics

import java.lang.StringBuilder

fun main() {

    println(countTo100())

    val employees = listOf(
        Employees("John", "Smith", 2012),
        Employees("Jane", "Wilson", 2015),
        Employees("Mary", "Johnson", 2010),
        Employees("Mike", "Jones", 2002)
    )

    findByLastName(employees, "John")

    println(employees.minBy { it.startYear })

}

fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}

fun countTo100With() =
    with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }

fun countTo100Apply() =
    StringBuilder().apply {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
    }

fun findByLastName(employees: List<Employees>, lastName: String) {
    employees.forEach returnBlock@ {
        if (it.lastName == lastName) {
            println("Yes")
            return@returnBlock
        }
    }
    println("no")
}


data class Employees(val firstName: String, val lastName: String, val startYear: Int) {

}