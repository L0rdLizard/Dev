package code.homework2.n2

import kotlin.text.StringBuilder

fun capit(stroka : String) : String{
    val result = StringBuilder()
    var flag = 0
    for (element in stroka.indices){
        if (flag == 1) {
            result.append(stroka[element].uppercaseChar())
            flag = 0
            continue
        }
        if ((stroka[element] == '-') || (stroka[element] == '_')){
            flag = 1
            continue
        }
        result.append(stroka[element])
    }
    return result.toString()
}


fun main(){
    var teststroka = "The_Stealth-Warrior"
    teststroka = capit(teststroka)
    println(teststroka)
}