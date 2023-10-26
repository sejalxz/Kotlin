package AccessModifiers

// In Kotlin: visibility of variables/properties and methods/functions is public by default.
// public, internal, private, protected

//public class
public class publicClass1(){

}

class publicClass2(){

}

// private
private class privClass(){

}
internal class internalClass(){

}

class Person(private val firstName: String = "temp_fname", private val lastName: String = "temp_lname") {
    private var nickName: String? = null
    protected var childName : String? = null
    internal var phoneNo : Long = 9987654321L

    public var fullName: String = "$firstName $lastName"
    private fun information(){
        val nickNameToPrint = nickName ?: "No nickname provided"
        println("$firstName ($nickNameToPrint) $lastName")
    }

}