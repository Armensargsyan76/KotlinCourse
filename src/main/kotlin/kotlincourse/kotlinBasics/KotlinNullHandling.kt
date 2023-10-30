package kotlincourse.kotlinBasics

fun main() {

    val str: String? = null
    println("what?? ${str?.toUpperCase()}")

    val str2 = str ?: "This is the default value"

    println(str2)

    //this is works, because ?
    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String
    println(str3)

    //this is not
//    val str5: String? = null
//
//    val str4 = str5!!.toUpperCase()
    val str7: String? = "this isn`t null"
    str7?.let { printText(it) }

}

fun printText(text: String) {
    println(text)
}