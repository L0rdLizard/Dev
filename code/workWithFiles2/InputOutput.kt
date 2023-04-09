package code.workWithFiles2

import java.io.File
import java.io.IOException
import java.util.Scanner

fun main(){
//    val lessonFile = File("H:\\guap\\suai\\Dev\\code\\workWithFiles2\\LessonFile.txt")
//    lessonFile.writeText("Hello world", Charsets.UTF_8)

    val result = readFromFile("H:\\guap\\suai\\Dev\\code\\workWithFiles2\\LessonFile.txt")
    println(result)
}

fun readFromFile (path : String) : String{
    return try{
        val scanner = Scanner(File(path))
        var output = ""
        while (scanner.hasNextLine()){
            val line = scanner.nextLine()
            output += "\n"
            output += line
        }
        output
    } catch (e : IOException){
        e.printStackTrace()
        ""
    }
}