package Classes.Constructors

// Class without methods, props
// class Person

// class Person  === class Person constructor()


// Primary Constructors
class Person(_firstName: String, _lastName: String) {
    val firstName: String
    val lastName: String
    init {
        firstName = _firstName
        lastName = _lastName
    }

    // init block is ran everytime an instance is created, you can have multiple init blocks
}

class Person2(_firstName: String, _lastName: String) {
    private val firstName: String = _firstName
    private val lastName: String = _lastName
}

class Person3(val firstName: String, val lastName: String) {

}


// Secondary Constructor

class Teacher(val firstName: String, val lastName: String) {

    init{
        println("Init 1")
    }
    constructor(): this ("defaultFN", "defaultLN"){
        println("secondary constructor. I runs when the args are not passed while creating the object")
    }

    init{
        println("Init 2")
    }

}


// Default Primary Constructor Class
class Student(val firstName: String = "student_name", val lastName: String = "student_lastname") {

}