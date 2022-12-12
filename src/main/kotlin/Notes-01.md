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

