package collections

import dataset.Course
import dataset.CourseCategory
import dataset.courseList

fun main() {
    //exploreFilter()

    val courseList = courseList()
    exploreFilter(courseList)
    exploreFilter(courseList, predicateDev)
    exploreFilter(courseList, predicateDesign)

}

// Version 1
fun exploreFilter(courseList: MutableList<Course>) {
    courseList
        .filter { it.category == CourseCategory.DEVELOPEMENT }
        .forEach {
            println("Dev Course: \t $it")
        }
    courseList
        .filter { it.category == CourseCategory.DESIGN }
        .forEach {
            println("Design Course: \t $it")
        }
}

val predicateDev = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
val predicateDesign = { c: Course -> c.category == CourseCategory.DESIGN }

//Version 2
fun exploreFilter(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {
    courseList
        //.filter { it.category == CourseCategory.DEVELOPEMENT }
        .filter { predicate.invoke(it) }
        .forEach {
            println("${it.category} Course: \t $it")
        }
}


// simple version
fun exploreFilter() {
    // Used to filter out elements from a Collection

    var myList = mutableListOf<Int>(1, 2, 3, 4, 5, 6)

    val result = myList.filter { it >= 5 }
    println("Result is : \t $result")


}
