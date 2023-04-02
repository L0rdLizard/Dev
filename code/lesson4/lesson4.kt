package code.lesson4

fun intCheck(input : String) : Boolean{
    val regex = Regex("[^?:a-zA-Z|\\s]+")
    return !((input == null) || (!regex.matches(input)))
}


fun main() {
    println("Type a number")
    var input : String = readln().trim()
    while(!intCheck(input)){
        println("input can contain only numbers")
        input = readln().trim()
    }
    println(input)
}