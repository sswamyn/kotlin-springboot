package collections

fun main() {
    exploreSequences()
}

// when using Sequence --> They are applied lazily
fun exploreSequences() {
    // Default List
    val nameList = listOf("Swamy", "Suraj", "Shauna", "Mark", "Rick", "Zune")
    println("Name longer than 5 : \t ${nameList.filter { it.length >= 5 }.map { it.uppercase() }}")

    // Now to Lazy bunch! :)
    val nameListUsingSequence = listOf("Swamy", "Suraj", "Shauna", "Mark", "Rick", "Zune")

    val namesLongerThan4 =
        nameListUsingSequence
            .asSequence()  // must use asSequence() to trigger Lazy evaluation;
            .filter { it.length >= 5 } // "each element" is pasted through the pipe,
            .map { it.uppercase() }
            .toList()  // with Sequence we need a terminal operation; Since we will get each element
    println("Selected Names : \t $namesLongerThan4")
    // Sequences are better while processing extremely large Collections

    val range = 1..1000_000_000

    /** This results in an OutOfMemory exception since it is process the whole 1 billion values together
    range
    .map{it.toDouble()}
    .forEach {
    println(" Value is : $it")
    }
     **/
    // THis time we are processing one element at a time, we would not get the Exception
    range
        .asSequence() // Adding asSequence
        .map { it.toDouble() }
        .take(48)
        .forEach {
            println(" Value is : $it")
        }

}
