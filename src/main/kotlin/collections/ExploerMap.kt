package collections

import dataset.Course
import dataset.KAFKA
import dataset.courseList

fun main() {

    //exploreMap(courseList())
    //exploreMap(courseList(), predicateDev)
    //println(".. \n\n")
    //exploreMap(courseList(), predicateDesign)

    // flatMap : used when a collection has another collection as its items/members
    //          It is used to get flattened list of lists
    //exploreListOfList()
    playWithListOfList()

}

fun playWithListOfList() {
    // filter Kafka from the list inside the 'course' list

    var courseList = courseList()


    var kafkaCourses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered
            .filter { it == KAFKA }
            .map {
                courseName
            }
    }
    println("Kafka courses : $kafkaCourses")
}

fun exploreListOfList() {

    val parentList = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))

    // Convert elements to Double retaining the listOf(listOf()) structure
    val result = parentList.map { outerList ->
        outerList.map {
            it.toDouble()
        }
    }
    println("Result : $result")

    // Faltten the listOf(listOf())
    val result2 = parentList.flatMap { outerList ->
        outerList.map {
            it.toDouble()
        }
    }
    println("Result 2 : $result2")
}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val courseName = courseList
        .filter(predicate)
        .map { "${it.name}  - ${it.category} " }

    courseName.iterator().forEach { println("Name : $it") }
//
}


// Map can be used to convert one dataType to another
// Here is an exmaple
fun exploreMap(courseList: MutableList<Course>) {

    val courseName = courseList
        .map { "${it.name}  - ${it.category} " }

    courseName.iterator().forEach { println("Name : $it") }
//    println("Course Names: \t $courseName")
}