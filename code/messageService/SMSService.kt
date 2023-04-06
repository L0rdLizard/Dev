package Lesson0404

class SMSService:MessageService() {
    override fun sendMessage(sender: String, recever: String, message: String) {
        if ((sender.length == 9) && (recever.length == 9)) {
            super.sendMessage(sender, recever, message)
        }
    }

}