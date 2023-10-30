package kotlincourse.kotlinBasics

fun main() {

    val immutableMap = mapOf(
        1 to Cars("green ", "Toyota", 2015),
        2 to Cars("black ", "Ford", 2012),
        3 to Cars("red ", "Mercedes", 2019),
        17 to Cars("red", "BMW", 2015),
        8 to Cars("green", "Ford", 2010)
    )

    println(immutableMap.toSortedMap())

//    println(immutableMap.javaClass)
//    println(immutableMap.map { it.value.year })
//    println(immutableMap.filter { it.value.model == "Ford"})
//    println(immutableMap.filter { it.value.model == "Ford"}
//        .map { it.value.color })

//    println(immutableMap.all { it.value.year > 2014 })
//    println(immutableMap.any { it.value.year > 2014 })
//    println(immutableMap.count() { it.value.year > 2014 })
    val carss = immutableMap.values
//    println(carss.find { it.year > 2014 })
    println(carss.groupBy { it.color })
    println(carss.sortedBy { it.year })

    val mutableMap = hashMapOf(
        1 to Cars("yellow ", "Toyota", 2015),
        2 to Cars("pink ", "Ford", 2012),
        3 to Cars("red ", "Mercedes", 2019),
    )

    val setInts = setOf(1, 5, 8, 23, 65)

//    println(setInts.filter { it % 2 != 0 })
//    println(immutableMap.filter { it.value.year == 2015 })

    val car = Cars("blue", "Corvette", 1959)
    val (color, model, year) = car
//    println("color = $color, model = $model, and year = $year")

    val ints = arrayOf(1, 5, 8, 6, 32, 78, 12)
    val add10List = ints.map { it + 10 }
//    println(add10List)


}

data class Cars(val color: String, val model: String, val year: Int) {

}