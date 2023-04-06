package code.TestsWithArrays

fun main (){
    var array = arrayOf(1, 2, 3, 8, 15, 7, 12)
    array.sort()

    var array2 = array
    array2.sortBy { it }

//    println(array.contains(8))

    println(array.min())
    println(array.max())
    var maximum = array[0]
    for (element in array){
        if (element > maximum)
            maximum = element
    }
    println(maximum)
//    for (element in array){
//        println(element)
//    }
//    for (index in array2){
//        println(index)
//    }


}