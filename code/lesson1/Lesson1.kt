package code.lesson1

fun main(args: Array<String>) {
    println("Hello World!")

    val year = 2000
    if ((year % 4 == 0) || (year % 400 == 0)) {
        if ((year % 100 == 0) && (year % 400 != 0)) {
            println("Not leap year")
            return
        }
        println("Leap year")
    }else println("Not leap year")
}