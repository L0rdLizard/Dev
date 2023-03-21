package code.homework2.n1

//(1 until number).filter { it % 3 == 0 || it % 5 == 0 }.sum()
fun threefive(x : Int) : Int{
    if (x <= 0) return 0
    var sum = 0
    for (element in 1 until x){
        if ((element % 3 == 0) || (element % 5 == 0)){
            sum+= element
        }
    }
    return sum
}
fun main(){
    val res = threefive(readln().toInt())
    println(res)
}