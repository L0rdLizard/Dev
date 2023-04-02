package code.yandexCup2018.z2

fun polindrom(string :String){
    var result = "No result"
    for (index in 0..string.length) {
        var tempResult = "No result"

        if ((index+1 < string.length) && (string[index] == string[index+1])) {
            tempResult = string.substring(index, index + 2)
        } else if ((index+2 < string.length) && (string[index] == string[index+2])){
            tempResult = string.substring(index, index + 3)
        }

        if ((tempResult != result) && (tempResult.length == result.length)){
            for (element in tempResult.indices){
                if (tempResult[element].code == result[element].code)
                    continue
                else if (tempResult[element].code < result[element].code){
                    result = tempResult
                    break
                }
            }
            continue
        }

        if ((tempResult.length <= result.length)){
            result = tempResult
        }
    }
    println(result)
}

fun main(){
    val string = "ratacatyabai"
    polindrom(string)
}