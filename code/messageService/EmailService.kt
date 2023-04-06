package Lesson0404

class EmailService:MessageService() {
    override fun sendMessage(sender: String, recever: String, message: String) {
        if ((sender.contains("@")) && (recever.contains("@"))) {
            super.sendMessage(sender, recever, message)
        }
    }
}