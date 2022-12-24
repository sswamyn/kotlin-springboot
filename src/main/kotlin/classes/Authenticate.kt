package classes

// Object keyword allows us to define and create(instantiate a class)
//   Used to create Singleton instance of a class
//   We do not instantiate this class, we can reuse one instance multiple times
//  ?? THread safe?
// Cannot inject constructor arguments // Instead use Spring framework to inject

object Authenticate {
    fun authenticate(userName: String, password: String) {
        println("TODO: Implement auth framework")
    }
}

fun main() {
    Authenticate.authenticate("Swamy", "learn")

}