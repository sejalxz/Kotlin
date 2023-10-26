package Interface

// v2

import AccessModifiers.Person

interface PersonInfoProviderV2 {

    val provideInfo : String

    fun printInfo2(person: Person) {
        println(provideInfo)
        person.information()
    }
}

class BasicInfoProvider2 : PersonInfoProviderV2{

    override var provideInfo: String = "Basic Info Provider"
        get() {
            return field
        }
        set(value) {
            field = value
        }

    override fun printInfo2(person: Person) {
        super.printInfo2(person)
    }

}

fun main(){
    val provider = BasicInfoProvider2()
    provider.provideInfo = "Info about Donna"
    provider.printInfo2(Person("Donna", "Paulsen"))
}

