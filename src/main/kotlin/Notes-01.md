### Variable declaration 

* val - Immutable variables
* var - Mutable variables 

### Top-Level functions
    THese are equivalent of static method in Java, for example the Utility functions.
In Kotlin, there is no need to have class that holds the funciton. 

#### Kotlin File vs. Kotlin Class 
___Kotlin File___ hold the top-level funcitons and variables 
These top-level functions can be accessed/invoked from other classes, by referencing the package and the funciton name. 

### Data class 
DTOs (data transfer objects), Domain classes, and value objects are the best examples of Data classes 

***Data Classes*** have '''data''' in front of the '''class''' keyword 
> Example: 
``` 
    data class Course(
        val is: Int,
        val name: String
    )
``` 

Kotlin autogenerates these methods: equals(), hashCode(), and toString()
Data class must have at least one constructor 

Coolest feature is the .copy() method to get a new instance with all the same attributes

## Key Kotlin - Object concepts 

* ___Any___ is the superclass for all Kotlin classes. [Object in Java]
* By default all classes in Kotlin are ___Final___ and as such cannot be extended 
* If an class wants to allow extending the class, it needs to defined with key word ___open___ 
> open class User(val name: String) {...}
* Subclass that extends this will look like 
> class Student(name: String) ___: User(name)___
* A class can extend only one class, similar to Java we cannot extend from more than one class 

<https://kotlinlang.org/docs/inheritance.html#derived-class-initialization-order>

### Overriding functions 
Similar to open keyword used to allow a class to be extended, open keyword can be used to allow for a function to be overloaded. 

### Overriding variables 

## Object Keyword 

'object' keyword allows us to create a class and an instance of it at the sametime. 
Equivalent to singleton pattern in Java
```

object Authenticate {
    fun authenticate(userId : String, password : String) {
        println("Implement the auth framework") 
    }
}
```
Usage 
```
fun main() {
        Authenticate.authenticate("userId", "passcode")
}
```

### Companion object 

> Equivalent to ```static``` in Java

We have to use ```companion``` if we want to use ```object``` inside a class

## Interfaces 

Interfaces are very similar to Java interfaces. In Kotlin, we can have both abstract and non-abstract methods in it 
Meaning, there can be some implementation within a Kotlin Interface. Catch is it cannot maintain any object state. 

#### Interface with abstract method 
interface CourseRepository {
    fun getById(id: Int): Course
}

___Usage___
```
class SqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course{
    return Course(id = id, 
                "Kafka for.. ",
                "Swamy")   
    }
} 
```

#### Interface with abstract method + non-abstract (with implementation) method
```
interface CourseRepository {
    fun getById(id: Int): Course
    fun save(course: Course): Int {
        println("Course: $course")
        return course.id
    }
}
```





































