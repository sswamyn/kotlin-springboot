package collections


fun main() {

    exploreList()
    exploreSet()
    exploreHashMap()
}

fun exploreHashMap() {
    var nameAgeMap = mapOf("Swamy" to 100000, "Suraj" to 18)
    // Keys are Swamy & Suraj, the corresponding values 100000 and 8
    println(nameAgeMap)
    val nameAgeMutableMap = mutableMapOf("Swamy" to 10000000, "Suraj" to 18)
    println(nameAgeMutableMap)
    nameAgeMutableMap.put("Rick", 58)
    nameAgeMutableMap["Rick II"] = 55
    println(nameAgeMutableMap)

}

fun exploreSet() {
    val names = setOf("Suraj", "Swamy", "Mark")
    println("Names are: $names")

    val mutableNames = mutableSetOf<String>("Suraj", "Swamy", "Mark")
    println("Names are: $mutableNames")

    mutableNames.add("Zune")
    mutableNames.add("Rick")
    println("Names are: $mutableNames")
    mutableNames.remove("Rick") // remove
    println("Names are: $mutableNames")

}

fun exploreList() {
    val names = listOf("Suraj", "Swamy", "Mark")
    println("Names are: $names")

    val mutableNames = mutableListOf<String>("Suraj", "Swamy", "Mark")
    println("Names are: $mutableNames")

    mutableNames.add("Zune")
    mutableNames.add("Rick")
    println("Names are: $mutableNames")
    mutableNames.removeAt(4)
    println("Names are: $mutableNames")
}
