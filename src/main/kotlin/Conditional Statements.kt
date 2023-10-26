// Conditional Statements

fun main() {

    var bill: Number? = null

    // if statements
    if(bill == null){
        println("Bill is null")
    }
    else{
        println("Your bill due is : $bill")
    }

// when statement
    when(bill) {
        null -> println("No bill")
        else -> println("Due amount : $bill")
    }

// assign values depending on logical conditions

// using if-else
    var alphabet: Char? = null

    alphabet = 'B'
    val alphabetToPrint = if(alphabet != null) alphabet else "Bleh!"

    println(alphabetToPrint)

// using when
    var alphabet2: Char? = null

    val alphabet2ToPrint = when(alphabet2){
        null -> "Bleh2!"
        else -> alphabet2
    }
    println(alphabet2ToPrint)
}

