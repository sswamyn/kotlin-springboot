package basics

fun main() {
    //if-else
    // when

    var name = "Sundaresh"
    name = "Shauna"
    if (name.length == 9)
        println("Name is nine characters long")
    else
        println("Name is not nine characters long! ")

    //Kotlin - if-else is an expression
    val result = if (name.length == 9)  // expression is evaluated and the assigned to variable '''result'''
        println("Name is nine characters long")
    else
        println("Name is not nine characters long! ")

    println("Result is : $result") // Output is "Result is : kotlin.Unit" ;; Special type in Kotlin -- No value
    // this is because we did not returning any thing from the code

    // ## Same as above with the return added to the if-else block
    val result2 = if (name.length == 6) { // Notice the curly braces, since we have a multi-line!
        println("Name is nine characters long")
        name.length // name, name.length, result.. we can return any of those values
    } else {
        println("Name is not nine characters long! ")
        name
    }

    println("Result is : $result2") // Output is "Result is : kotlin.Unit" ;; Special type in Kotlin -- No value
    // this is because we did not returning any thing from the code

    // Enumeration example
    //      Based on the value of the variable return different results
    //          as in: 1--> GOLD 2--> Silver 3--> Bronze
    val position = 1 // [1, 2, 3, or any number]
    val medal = if (position == 1) {
        "GOLD"
    } else if (position == 2) {
        "Silver"
    } else if (position == 3) {
        "Bronze"
    } else {
        "No medal"
    }
    println("Medal is $medal")

    // Implementing the same logic using '''when'''
    // val medal2 = 2
    val medal2 = when (position) {
        1 -> {
            "GOLD"
        }

        2 -> {
            "Silver"
        }

        3 -> {
            "Bronze"
        }

        else -> {
            "No medal"
        }
    }
    println("Medal2 is $medal2")

    // Even better 'cleaner' and consise version
    val medal3 = when (position) {
        1 -> "GOLD"
        2 -> "Silver"
        3 -> "Bronze"
        else -> "No medal"

    }
    println("Medal3 is $medal3")

}