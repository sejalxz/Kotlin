package Interface

import AccessModifiers.Person

// Marker Interface : No props/functions
//interface PersonInfoProvider


// Abstract Class
// class BasicInfoProvider : PersonInfoProvider// solution -> abstract class

//abstract class BasicInfoProvider : PersonInfoProvider
// Abstract class is a class that can not be initiated by itself, it needs to be subclassed by another class to use its properties. An abstract class is declared using the “abstract” keyword in its class definition.
// https://www.geeksforgeeks.org/abstract-classes-in-java/


// In Java, you use override annotation
// In Kotlin, you use override keyword

interface PersonInfoProvider {
    fun printInfo(person: Person)
}
class BasicInfoProvider : PersonInfoProvider{
    override fun printInfo(person: Person) {
        println("Basic Info Provider")
        person.information()
    }
}

fun main(){
    val provider = BasicInfoProvider()
    provider.printInfo(Person("Jessica", "Pearson"))
}