package code.oopTest

class Smartphone(model: String, processor: String, displayDiagonal : Double)
    : Phone (model, processor, displayDiagonal)
{
     fun makePhoto (){
         println("Photo is taking")
     }

    override fun call(number: String) {
        println("You have started a video call with $number")
    }
}
