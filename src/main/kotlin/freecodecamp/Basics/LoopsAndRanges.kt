package freecodecamp.Basics

fun main() {
    val range = 1..10
    for (num in range){
        println("num : $num")
    }

    val reverseRange = 10 downTo 1
    for (num in reverseRange){
        println("revNum : $num")
    }

    for (num in range step 2){
        println("num : $num")
    }
}