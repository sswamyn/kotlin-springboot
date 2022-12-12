package interfaces

import classes.Course
interface CourseRepository {
    fun getById(id: Int): Course
}

// bleow SqlCourseRepo extends CourseRepository
class SqlCourseRepo : CourseRepository {

    override fun getById(id: Int): Course {
        return Course(id, "Name of course", "Author")
    }
}

