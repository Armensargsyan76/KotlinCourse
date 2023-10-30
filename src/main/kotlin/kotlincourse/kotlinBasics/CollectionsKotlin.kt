package kotlincourse.kotlinBasics

fun main() {

    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass)

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    val mutableList = mutableListOf(1, 2, 3)
    println(mutableList.javaClass)

    val array = arrayOf("red", "white", "black")
    val colorList = listOf(*array)
    println(colorList)

    println(strings.last())
    println(strings.reversed())

    val ints = listOf(1, 2, 3, 4, 5)
    println(ints.max())

    println(colorList.zip(strings))
}