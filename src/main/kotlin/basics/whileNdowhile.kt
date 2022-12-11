package basics

fun main() {
    //exploreWhile()
    exploreDoWhile()
}

fun exploreDoWhile() {
    var i = 0
    // Best usecase for DoWhile is when you want to make sure the block is executed at least once
    do {
        println("Value of i is : $i")
        i++
    }while (i <5)
}

fun exploreWhile() {
    var x = 1
    while (x < 5){
        println("x is : $x")
        x++
    }
}