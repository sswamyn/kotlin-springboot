package collections

fun main() {
    collections_nullablity()
}

fun collections_nullablity() {

    var listOfString: MutableList<String>? = null  // adding '?' to allow Null

    // Now we have to use Safe operator
    listOfString?.forEach {
        println("In the Null list loop")
        println(it)
    }

    listOfString = mutableListOf()
    listOfString?.add("Swamy")
    listOfString?.forEach {
        println("In the list loop with values")
        println(it)
    }

    // Another Null scenario; When the Collection is not Null, but one of the value in the collection is Null
    var listOfStringWithNull: List<String?> = listOf("Adam", null, "Swamy")
    listOfStringWithNull.forEach {
        println("Length of each element : ${it?.length}")
    }
}
