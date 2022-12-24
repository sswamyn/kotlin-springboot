package interfaces

import classes.Item

// InterfaceVariable - to learn about variables declared in interfaces
interface ItemRepo {
    var isItemInStock: Boolean // property values cannot be initialized in Interfaces!!
    fun getItem(id: Int): Item

    fun save(item: Item): String {
        return item.name
    }

}

class ScrewDriver : ItemRepo {
    override var isItemInStock: Boolean = false
    override fun getItem(id: Int): Item {
        return Item()
    }

    override fun save(item: Item): String {
        if (item.name == "Screw Driver")
            this.isItemInStock = true
        return item.name
    }

}