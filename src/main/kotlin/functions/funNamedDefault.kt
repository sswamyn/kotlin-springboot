package functions

import java.time.LocalDate

fun printUserDetails(
    name: String,
    email: String = "noreply@noreply.com",
    dob : LocalDate = LocalDate.now()
){
    println(""" Here are the details
        Name : $name
        Date of birth : $dob
        email : $email
    """.trimIndent())
}

fun main() {
    // Default parameter value
    //      A default value can be defined in the function definition,
    //       so that the caller does not have to pass this parameter
    printUserDetails("Swamy") // calling printUserDetail with only one parameter
    printUserDetails(email = "swamy@swamy.com", name = "Swamy") // Partial list of param, & Different order!!
                                                                //    this is possible because they are named parameters
    printUserDetails(dob = LocalDate.parse("2000-01-01"),name = "Swamy")
}