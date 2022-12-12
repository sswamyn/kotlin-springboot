package classes

data class Course(
    val id: Int,
    val name: String,
    val author: String
)

fun main() {
    val myCourse = Course(1, "Kotlin with Spring", "Swamy")
    println(myCourse)

    // equality check
    val myCourse2 = Course(1, "Kotlin with Spring", "Swamy")
    println("Equality check : ${myCourse == myCourse2}")

    // Copy an object
    val myCourse3 = myCourse.copy()
    println("Clourse #3 : $myCourse3")

    val myCourse4 = myCourse.copy(id = 4)
    println("Clourse #4 : $myCourse4")

}