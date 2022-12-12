package classes

class PersonInit (
    var name : String = "No Name", // to add Default value = "No Name"
    var age : Int = 0,
    var email : String = "NoMail@NoMail.com")
    {

    init {
        println("Engine starting.. ")
    }
        fun otherMethods() {
            println("In OtherMethods")
        }

        fun toPrint() {
            println("""
                Name = $name
                Age = $age
                email = $email
            """.trimIndent())
        }
}

fun main() {
    var aPerson = PersonInit("Swamy", 25, email = "swamy@terminator.com")
    println(aPerson.otherMethods())

    aPerson.toPrint()
    println("Second object")
    var yetAnotherPerson = PersonInit()
    yetAnotherPerson.toPrint()
}