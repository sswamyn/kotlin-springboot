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