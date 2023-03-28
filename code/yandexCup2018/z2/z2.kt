package code.yandexCup2018.z2

import kotlin.random.Random

fun polindrom(string :String){
    var flag = false
    var tempResult = "No result"
    var result = "No result"
    for (index in 0..string.length) {
        if ((index+1 < string.length) && (string[index] == string[index+1])) {
            tempResult = string.substring(index, index + 2)
        } else if ((index+2 < string.length) && (string[index] == string[index+2])){
            tempResult = string.substring(index, index + 3)
        }
        if ((tempResult.length <= result.length)){
            result = tempResult
        }
    }
    println(result)
}

fun main(){
    val string = "reetabatyuui"
    polindrom(string)
}