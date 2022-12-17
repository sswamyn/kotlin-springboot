package classes

import java.io.File

fun main() {
    val filename = "C:\\home\\kotlin\\kotlin-springboot\\kotlin-playground\\src\\main\\kotlin\\classes\\Authenticate.kt"
    //println(readFile(filename))

//    for (in.readFileLineByLine("filename"))

    readFileLineByLine(filename).forEach { each -> println(each) }

}

/*
This function takes in a filename as a parameter and uses the readText() method from the File class to read the contents of the file into a string. The string is then returned from the function.

Note that this function assumes that the file is located in the current working directory. You can specify a different path for the file by providing the full path to the file in the filename parameter.

Additionally, this function does not handle any potential exceptions that may be thrown when reading the file. In a production environment, it is recommended to add error handling to the function to ensure that it can gracefully handle any errors that may occur.
*/
fun readFile(filename: String): String {
    val file = File(filename)
    return file.readText()
}

/*
This function takes in a filename as a parameter and uses the useLines method from the File class to read the contents of the file. The useLines method returns an Iterable object that can be used to iterate over the lines of the file. In this example, the toList() extension function is used to convert the Iterable object into a List of Strings, where each element in the list represents a line from the file. The list of lines is then returned from the function.

Note that this function assumes that the file is located in the current working directory. You can specify a different path for the file by providing the full path to the file in the filename parameter.

Additionally, this function does not handle any potential exceptions that may be thrown when reading the file. In a production environment, it is recommended to add error handling to the function to ensure that it can gracefully handle any errors that may occur.
*/
fun readFileLineByLine(filename: String): List<String> {
    val file = File(filename)
    return file.useLines { lines -> lines.toList() }
}
