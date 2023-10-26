package GetterSetters

class Person(val firstName: String = "temp_fname", val lastName: String = "temp_lname") {
    var nickName: String? = null
        //Setter
        set(value) {
            // you can do any manipulation here
            field = value
            println("Inside setter: new nickName is $field")
        }
        //Getter
        get() {
            // you can do any manipulation here
            println("Inside getter: nickName is $field")
            return field
        }
}