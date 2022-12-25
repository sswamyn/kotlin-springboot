package collections

fun main() {
    exploreMutableHashMap()
}

fun exploreMutableHashMap() {
    val nameAgeMap = mutableMapOf("Swamy" to 55, "Suraj" to 20)

    nameAgeMap
        .forEach { (k, v) ->
            println("Key : \t $k and Value : \t $v")
        }

    val value = nameAgeMap.get("Swamy") // nameAgeMap["Swamy"]
    println("Value is \t $value")

    val value2 = nameAgeMap.getOrElse("Swamynathan") { "0" }
    println("Value is \t $value2")

    // containsKey()
    println("Find if this Key is present : \t ${nameAgeMap.containsKey("Swamy")}")

    // Find the highest age
    val maxAge = nameAgeMap
        .maxByOrNull { it.value }
    println("Highest age : \t $maxAge")
}