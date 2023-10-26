package Basics

// top level variable / global variable
val gravity:Number = 10

fun main() {
    var name:String = "Sejal"
    println("Hello ${name}")

    // Variables

    // 1. read only
    val PI:Number = 3.14

    // 2. mutable variables
    var month:String = "January"
    month = "Feb"


    // Data-types

    // Note : Difference b/w Java and Kotlin is that the data types in the Kotlin are not null by default.
    // There is a distinct difference between string and a nullable string


    // Nullable Data-Type -> Add question mark
    val day: String? = null


    // Kotlin can do type inferences so no need to add Data-type but if we want it to be nullable then mention data-type with ?
    val greeting: String? = "Bonjour!"


    //Data-Types - No distinction b/w primitive & wrapper types

    //Numbers -> INT, BYTE, SHORT, LONG
    //Floating Numbers -> Float, Double
    //Character -> Char
    //Boolean -> Boolean
    //String -> String


    val age : Int = 30
    val salary : Long = 3000L // long

    // New Line
    val multiLine = "ABC \nDEF"
    println(multiLine)

    // Triple Quoted Strings
    val multiLine2 = """
        XYZ
        DEF
    """.trimIndent()
    println(multiLine2)
}

