package code.testRandom

import kotlin.random.Random

fun main (){
    println(randomGame(1))
}

fun randomGame (side : Int): Int {
    return Random.nextInt(1, side)
}