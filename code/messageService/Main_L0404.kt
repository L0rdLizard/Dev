import Lesson0404.EmailService
import Lesson0404.MessageService
import Lesson0404.SMSService

fun main(){
    var emailService = EmailService()
    var smsService = SMSService()
    emailService.sendMessage("Andrey@", "Alexandr@", "Hallo ma frend")
    smsService.sendMessage("812312385", "881412356", "Hallo ma frend")
}