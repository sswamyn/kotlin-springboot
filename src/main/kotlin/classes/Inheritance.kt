package classes

// Kotlin allows only extending one class
//   The child or extended class objects have access to the parent(super) class methods

//  Similarly instance variables can have 'open' so that the child class can overload

open class User(val name: String, age: Int) {
    var loginStatus: Boolean = false
    open fun login() {
        println("loging in ... ")
        println("\t \t status : ${isLoggedIn()} ")
    }

    fun isLoggedIn(): Boolean {
        return loginStatus
    }
}

class StudentUser(stdName: String, age: Int) : User(stdName, age) {
    override fun login() {
        println("\t Student login.. ")
        loginStatus = true
        super.login()
    }
}

class Instructor(teacherName: String, age: Int) : User(teacherName, age) {
    /*    override fun login() {
            super.login()
            println("\t Teacher login.. ")
        }*/
}

///
fun main() {
    val student1 = StudentUser("Suraj", 18)
    println("Name is ${student1.name}")
    student1.login()

    val instructor1 = Instructor("Sarika", 16)
    println("Name is ${instructor1.name}")
    instructor1.login()
}