package code.yandexCup2018.z3

import java.io.File

fun tir(filename : String){
    val lines = File("H:\\guap\\suai\\Dev\\code\\yandexCup2018\\z3\\test.txt").readLines()
    val count : Int = lines.size
    var circleC = arrayOf<Array<Int>>()
    var squareC = arrayOf<Array<Int>>()

    for (element in 1 until count){
        if (lines[element][0].digitToInt() == 0){
            var circle = arrayOf<Int>()
            circle += (lines[element][2]).digitToInt()
            circle += (lines[element][4]).digitToInt()
            circleC += circle
        }
    }

    for (circle in circleC) {
        for (value in circle) {
            print("$value ")
        }
        println()
    }
}
fun main(){
//    val str = File("test.txt").read()
    val lines = File("H:\\guap\\suai\\Dev\\code\\yandexCup2018\\z3\\test.txt").readLines()
//    val sum : Int = lines[1][2].digitToInt()
//    println(sum)
    println(lines)
    val str = lines[1]
    val result = str.map { it.code }

    println(result)

//    var cinema = arrayOf<Array<Int>>()
//    var array = arrayOf<Int>()
//    array += 2
//    array += 4
//    cinema += array
//    println(cinema[0][1])
//    tir("H:\\guap\\suai\\Dev\\code\\yandexCup2018\\z3\\test.txt")

}