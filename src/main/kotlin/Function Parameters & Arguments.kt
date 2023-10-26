import java.util.ArrayList

fun greetItems(greeting: String, itemsToGreet: Array<String>) {
    itemsToGreet.forEach{item ->
        println("$greeting $item!")
    }
}

fun greetItemsVarArg(greeting: String, vararg  itemsToGreet: String) {
    itemsToGreet.forEach{item ->
        println("$greeting $item!")
    }
}

fun namedArguments(firstArg: Int, secondArg: Int){
    println("First Arg $firstArg")
    println("Second Arg $secondArg")
}

fun defaultParameterValues(firstArg: Int = 0, secondArg: Int = 0){
    println("First Arg $firstArg")
    println("Second Arg $secondArg")
}

fun main(){
    val items = arrayOf("Kotlin", "Java", "Python")
    greetItems("Bonjour", items)
//    greetItems("Hello", listOf("Kotlin", "Java"))

    // No arguments available
        // You'll have to send an empty list
    greetItems("Hello", arrayOf())



    // vararg : variable number of aruguments
    // Kotlin allows functions to be defined such that they would accept a variable number of arguments.
    // Hence, this feature is called varargs.
    // Varargs allow users to pass in a comma-separated list of arguments, which the compiler will automatically wrap into an array.
    greetItemsVarArg("Hi", "Kotlin", "Java", "C#")

    //spread operator
    println("Spread Operator")
    greetItemsVarArg("BonneSoir", *items)


    println()
    // named arguments
    println("Named Arguments")
    namedArguments(10,20)
    println()
    namedArguments(20,10)
    println()
    // using named argument
    namedArguments(secondArg = 20,firstArg = 10)
    println()

    // Default Parameter values
    println("Default Parameter values")
    defaultParameterValues(secondArg = 23)
    defaultParameterValues()
}