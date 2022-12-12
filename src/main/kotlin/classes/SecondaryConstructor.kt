package classes

class SecondaryConstructor() {
    var name: String = "No Name"

    constructor(_name : String) : this(){
        name = _name
    }
}

fun main() {
    val secConstructor = SecondaryConstructor("Swamy")
    println(secConstructor.name)
    val secConstructor2 = SecondaryConstructor()
    println(secConstructor2.name)
    secConstructor2.name = "Swamynater"
    println(secConstructor2.name)

}