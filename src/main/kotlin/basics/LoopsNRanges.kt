package basics

fun main() {
    println("Base range; using 1..10")
    val range = 1..10 // 1..10 to generate a range
    for (i in range){
        println(i)
    }

    // Desenting order Range
    println("Reverse range; using 10 downTo 1")
    val reverseRange = 10 downTo 1// 10 downTo 1
    for (i in reverseRange){
        println(i)
    }

    // Reverse range while skipping // To produce 10 8 6 4 2
    println("For loop with skipping, using '''step''' ")
    for (i in reverseRange step 2){
        println(i)
    }
}