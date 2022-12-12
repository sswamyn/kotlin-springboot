package classes

open class User(val name : String) {
    var loginStatus : Boolean = false
    open fun login() {
        println("loging in ... ")
        println("\t \t status : ${isLoggedIn()} ")
    }
    fun isLoggedIn() : Boolean {
        return loginStatus
    }
}

class Student(stdName: String) : User(stdName) {
    override fun login() {
        println("\t Student login.. ")
        loginStatus = true
        super.login()
    }
}

class Instructor(teacherName: String) : User(teacherName){
/*    override fun login() {
        super.login()
        println("\t Teacher login.. ")
    }*/
}

///
fun main() {
    val student1 = Student("Suraj")
    println("Name is ${student1.name}")
    student1.login()

    val instructor1 = Instructor("Sarika")
    println("Name is ${instructor1.name}")
    instructor1.login()
}