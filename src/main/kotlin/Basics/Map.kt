package Basics// Map

fun main() {
    val map = mapOf(1 to "A", 2 to "B", 3 to "C")

    map.forEach {
        println("${it.key} =>  ${it.value}")
    }

    map.forEach { (key, value) ->
        println("$key =>  $value")
    }
}

