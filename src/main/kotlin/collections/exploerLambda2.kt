package collections

//var add ={ x:Int, y:Int -> x+y}
var sub = { x: Int, y: Int -> x - y }
var mul = { x: Int, y: Int -> x * y }

//var div = { x: Int, y: Int -> { if (y != 0) x / y else 0 } }
var div = { x: Int, y: Int -> x / y }

fun cal(x: Int, y: Int, op: (x: Int, y: Int) -> Int): Int {
    if (op == div) {
        if (y == 0)
            println("Exception div by 0 ")
        //break "break" is allowed onlu inside a loop
    }
    return op(x, y)
}


fun add(x: Int, y: Int): Int {
    return x + y
}

fun main() {
    println(" Multiple ${cal(1, 2, { a: Int, b: Int -> a * b })} ")
    println(" Add  ${cal(1, 2, { a: Int, b: Int -> a + b })} ")

    var result = cal(1, 2, sub)//{ a: Int, b: Int -> a * b })
    println("Sub is \t $result")

    println("Division : ${cal(1, 2, mul)}")

    var p = cal(1, 2, div)
    println("Div = \t $p")

}