// Note : Kotlin also differentiates between nullable and non-nullable colection types.
// By default, collections are non-nullable

fun main(){
    val fruits = mutableListOf("Kiwi", "Mango", "Banana");
    fruits.add("Berry")

    fruits.forEach{
        println(it)
    }

    fruits.add(2, "Apple")
    println()
    fruits.forEach{
        println(it)
    }


    val map = mutableMapOf(1 to "A", 2 to "B", 3 to "C")

    map.put(23,"HBD")
    map[10]="march"

    map.forEach {
        println("${it.key} =>  ${it.value}")
    }
}

