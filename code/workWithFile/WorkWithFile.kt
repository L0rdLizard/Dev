package code.workWithFile

import java.io.File
import java.io.IOException
import java.util.Scanner

fun main() {
     writeToFile("1 2 3 4 5")
    //val number = 1
    //writeToFile(number.toString())
    readFromFile("H:\\guap\\suai\\Dev\\out_text.txt")
}

fun writeToFile(text:String) {
    val filename = File("code/workWithFile/out_text.txt")
    filename.writeText(text, Charsets.UTF_8)
}

fun readFromFile(path:String) {
    try {
        val scanner = Scanner(File(path))
        while (scanner.hasNextLine()) {
            val line = scanner.nextLine()
            val result = line.split("\\p{Space}".toRegex()).toTypedArray()
//            println(result.contentToString())
            println(result[1])
        }
    } catch (e:IOException) {
        println(e)
    }
}
