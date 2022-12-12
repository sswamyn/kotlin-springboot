package classes

//class Person {
class Person(var name : String = "No Name", // to add Default value = "No Name"
             var age : Int = 0)
{
    var email : String = "NoEmail@noemail.com"
    constructor(_email : String) : this(){
        email = _email
    }
    var handle : String = "what is a handle!"
    constructor(_name : String,
                _age : Int,
                _email : String,
                _handle : String) : this() {
                    this.name = _name
                    this.age = _age
                    this.email = _email
                    this.handle = _handle
                }

    //constructor() : this()

    fun action() : String {
        return "walking"
    }
}

fun main() {
    val aPerson = Person("Swamy", 10534) // not need for '''new()'''
    aPerson.action()
    println("Name : ${aPerson.name} of age ${aPerson.age} is ${aPerson.action()}")
    val bPerson = Person("Swamy") // not need for '''new()'''
    bPerson.action()
    println("Name : ${bPerson.name} of age ${bPerson.age} is ${bPerson.action()}")

    //val cPerson = Person(name = "Swamynator", 25, "Swamyantor@terminator.com" ) // not need for '''new()'''
    val cPerson = Person(_email = "Swamyantor@terminator.com" )
    cPerson.action()
    println("Name : ${cPerson.name} of age ${cPerson.age} is ${cPerson.action()}")

    // complex example..
    val dPerson = Person("Swamy", 16, "swamymester@terminator.com", "@swamyister")
    println("Name : ${dPerson.name} of age ${dPerson.age} is ${dPerson.action()}, with email ${dPerson.email} and the handle is ${dPerson.handle}")


}