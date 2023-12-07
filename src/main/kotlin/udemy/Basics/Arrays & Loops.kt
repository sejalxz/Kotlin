package Basics//Arrays

fun main() {
    // array definition
    val fruits = arrayOf("Kiwi", "Mango", "Banana");

    //array methods
    println("size of fruits " + fruits.size)
    println("Fruit at index 0 : " + fruits[0])
    println("Fruit at index 1 : " + fruits.get(1))


    // for loop
    println("-----For Loop-----")
    for(fruit in fruits){
        println(fruit)
    }
    println()

    // for Each loop
    println("-----For Each Loop-----")
//    fruits.forEach {
//        println(it)
//    }

    // lambda syntax : if you have a function and it's only parameter is another function then u can omit the open-close parenthesis all together.
                    // You can pass the function by specifying the curly braces.
                    // the forEach syntax expects a function inside, hence we skip the open-close parenthesis
    fruits.forEach {fruit ->
        println(fruit)
    }
    println()


    // forEachIndexed
    println("-----For Each Indexed Loop-----")
    fruits.forEachIndexed { index, fruit ->
        println("$fruit is at index $index")
    }

    // index is always the first parameter
}

