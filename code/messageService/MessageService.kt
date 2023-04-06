package Lesson0404

abstract class MessageService {
    open fun sendMessage(sender:String, recever:String, message:String){
       println("Send message \"$message\" from $sender to $recever")
    }

}