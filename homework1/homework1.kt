package homework1

fun century (x : Int) : Int{
    return x / 100 + 1
}
fun main () {
    val year = 182
    val c = century(year)
    println("Century of $year is $c")
}