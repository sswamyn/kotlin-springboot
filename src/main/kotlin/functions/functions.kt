package functions

fun main() {
    // Explore some of the features of function in Kotlin
    printName("Swamy") //calling function with parameter
    var result = addition(1, 2)
    println("Result is : $result")

    var result2 = addition_diff(3, 4)
    println("Result is : $result2")

    // NOTE: functions without a return type is inferred as '''Unit'''
}

//Alternate implementation of Addition using in-line function
fun addition_diff(x: Int, y: Int) = x + y // simple!! :)

//Function that takes multiple parameters and RETURNS a value
//      fun function_name(parameter: data_type,... ): return_dataType // type ANY
fun addition(x: Int, y: Int): Int {
    return x + y
}

// Function with parameters
fun printName(name: String) {
    println("Name calling this funciton is : \" $name \" ")
}
