package ElvisOperator

class Person(val firstName: String = "temp_fname", val lastName: String = "temp_lname") {
    var nickName: String? = null

    fun information(){
        val nickNameToPrint = nickName ?: "No nickname provided"
        println("$firstName ($nickNameToPrint) $lastName")
    }

}