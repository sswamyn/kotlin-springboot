package classes

class Item() {
    var name: String = "TBD"
    var price: Double = 0.0
        //  get() = field // backing field access to the attributes '''field''' and '''value''' for setters
        get() {
            println("inside the getter funciton")
            return field
        }
        set(value) {
            println("inside the setter funciton")
            if (value >= 0.0) {
                field = value
            } else {
                throw IllegalArgumentException("Price cannot be Negative")
            }
        }
    var sku: String = "TBD"

    constructor(_name: String) : this() {
        name = _name
    }
}


///////////////////////////////
fun main() {
    val item1 = Item("iPhone")
    println("Item1: name: ${item1.name} and price is \$${item1.price}, it has a SKU of ${item1.sku}")
    item1.price = 10.0
    println("Item1: name: ${item1.name} and price is \$${item1.price}, it has a SKU of ${item1.sku}")
    // Code below will cause a runtime exception
    item1.price = -10.0
    println("Item1: name: ${item1.name} and price is \$${item1.price}, it has a SKU of ${item1.sku}")

}