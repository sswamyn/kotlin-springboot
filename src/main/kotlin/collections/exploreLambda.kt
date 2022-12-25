package collections

import java.util.stream.Stream

fun main() {

    val addLambda = { x: Int -> x + x } // no type inference so the arugment data type needs to explictily give the type

    println(" Calling the Lambda function addLambda with parameter 4 -> ${addLambda(4)}")

    var cnt = 0

    var sqr = { x: Int -> x * x }
    for (i in 1..100) {
        println(" $i squared is \t ${sqr(i)}")

    }

    println(" Calling the Fib Lambda  -> ${
        fib(47). // Max number is 47; after that the bits will overflow in the Long 
        invoke().forEach {
            print(it)
            print(", ")
            cnt++
            if (cnt == 5) {
                print("\n")
                cnt = 0
            }
        }
    }"
    )


}

fun fib(limit: Long): () -> Stream<Int> = {
    Stream.iterate(
        arrayOf(0, 1)
    ) { s: Array<Int> ->
        arrayOf(
            s[1],
            s[0] + s[1]
        )
    }
        .limit(limit) // short-circuit
        .map { s: Array<Int> ->
            s[0]
        }
    // .forEach { x: Int? -> println(x) }
}

fun getFibStream(): Stream<Int> {
    return Stream.iterate(
        arrayOf(0, 1)
    ) { s: Array<Int> ->
        arrayOf(
            s[1],
            s[0] + s[1]
        )
    }
        .map { s: Array<Int> ->
            s[0]
        } //what is .map() doing here?
}