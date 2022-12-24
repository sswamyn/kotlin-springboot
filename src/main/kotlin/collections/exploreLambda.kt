package collections

import java.util.stream.Stream

fun main() {

    val addLambda = { x: Int -> x + x } // no type inference so the arugment data type needs to explictily give the type

    println(" Calling the Lambda function addLambda with parameter 1 -> ${addLambda(1)}")
    val fib = 1
    val power = 8

    val fibGen = { x: Int ->
        Stream.iterate(Int[] = [0, 1], s -> new int[]{ s[1], s[0]+s[1] }) // lambda expression
        .limit(series)
        .map(n -> n[0])
        .collect(Collectors.toList());
    }

}