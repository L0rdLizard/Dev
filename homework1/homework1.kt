package homework1

fun century (x : Int){
    if (x < 0) {
        val y = x * -1
        if (x % 100 == 0) println("$x is " + (y / 100) + " BC")
        else println("$x is " + (y / 100 + 1) + " BC")
    }else {
        if (x % 100 == 0) println("$x is " + (x / 100) + " century")
        else println("$x is " + (x / 100 + 1) + " century")
    }
}
fun main () {
    val year = readln().toInt()
    century(year)
}