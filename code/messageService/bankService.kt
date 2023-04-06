package code.messageService

class bankService (number: String){
    private var cardNumber = ""
    init{
        if ((number.trim()).length == 19){
            cardNumber = number
            println("Your card number is $number")
        } else {
            println("Length of card number must be 16")
        }
    }
    fun cardCheck() :Boolean{
        return cardNumber[0] == '4'
    }
}