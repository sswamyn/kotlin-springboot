package interfaces

// MultipleInterfaceInheritance
// Interface #1
interface A {
    fun doSomeThing() {
        println(" DoSomeTHing in A")
    }
}

//Interface #2
interface B {
    fun doSomeThing() {
        println(" DoSomeTHing in B")
    }
}

// Implementation class
class AB : A, B {
    override fun doSomeThing() {
        super<A>.doSomeThing()
        super<B>.doSomeThing()
        println("In doSomeThing AB ")
    }

}

// Testing using a main()
fun main() {
    val ab = AB()
    ab.doSomeThing()
}