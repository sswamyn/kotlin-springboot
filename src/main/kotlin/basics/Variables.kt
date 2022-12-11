package basics

fun main() {
    val name : String = "Swamy"
    println(name)

    // name = "new Name" // causes complier error!

    var age : Int = 75
    println("My age is $age")  // the usage of $variable is referred to as String interpolation or String Templates
    // Since this is var, we can change the value
    age = age - 50
    println("Oops! No, it is $age :) ")

    // There is no '''primitive''' and '''wrapper''' types;
    //      Kotlin is all wrapper Class ex: Int, Long, etc.
    val salary = 30000L // Data type is not provided, since Kotlin can infer the data type
    // val salary : Long = 30000L // Explicit declare the data type
    println(salary)

    val course = "Kotlin Spring Class"
    println("The course is $course, and it is ${course.length} long")

    // Multi-line String
    val multiLine = "ABC \n DEF"// Old style
    println(multiLine)
    // Kolin's new multiline string using three double quotes
    val multiLineStr = """
    ABC
    DEF
    """
    println(multiLineStr) // this preserves the indentations!
    val multiLineStr2 = """
    ABC
    DEF
    """.trimIndent() // can be easily remove the indentations!
    println(multiLineStr2)

}