package Lesson0404

abstract class MessageService {
    open fun sendMessage(sender:String, recever :String, message:String){
        if ((sender.isEmpty()) || (recever.isEmpty()) || (message.isEmpty())) {
            println("All fields must be filled")
            return
        }
        println("Send message \"$message\" from $sender to $recever")
    }

}