package classes

// 'Companion' static inner class

class Student(
    name: String,
    private val age: Int = 0
) : User(name, age) {

    // equivalent of static inner class in Java
    companion object {
        const val noOfEnrollments = 10 //Static variable

        //Static function
        fun country(): String {
            return "USA"
        }
    }
}


fun main() {
    println(Student.country())
}