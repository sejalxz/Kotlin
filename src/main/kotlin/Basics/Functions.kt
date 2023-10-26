package Basics// functions

// functions also support type inference

// syntax : fun nameofFunction(): returnType {
//              return data
//          }


fun getGreeting(): String{
    return "Bonjour!"
}

// Unit Functions -> return nothing usefull..
// when you don't want to return anything

fun sayBonjour1(): Unit {
    println("Bonjour 1!")
}

fun sayBonjour2() {
    println("Bonjour 2!")
}

// sayBonjour1 & sayBonjour2 are same. Thus, when we skip a return type then the function has return type Unit.

// Return Nullable
fun sayGreeting(): String? {
    return if(Math.floor(Math.random() * 10 + 1) > 5){
        "Yay! Greater than 5"
    }
    else
        null
}

// single expression function
fun getSingleGreeting(): String = "Bonnesoir"


// Function Parameters
fun sayBonjour(name: String?) = println("Bonjour $name!")
fun greet(greeting: String?, name: String?) = println("$greeting $name!")


fun main(){
    // function
//    println(getGreeting())

    // Unit return type
//    sayBonjour1()
//    sayBonjour2()

    // Return Nullable
//    println(sayGreeting())

    // single expression function call
//    println(getSingleGreeting())

    // function parameter
    sayBonjour("Sejal")
}
