package code.oopTest

open class Phone (val model: String,
                  val processor: String,
                  val displayDiagonal: Double)
{

    open fun call (number : String){
        println("you are calling to $number")
    }
}