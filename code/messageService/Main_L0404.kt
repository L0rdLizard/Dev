import Lesson0404.EmailService
import Lesson0404.MessageService
import Lesson0404.SMSService
import code.messageService.bankService

fun main(){
    var emailService = EmailService()
    var smsService = SMSService()
    emailService.sendMessage("Andrey@", "Alexandr@", "Hallo ma frend")
    smsService.sendMessage("812312385", "881412356", "Hallo ma frend")
    var card = bankService("4234 5678 1234 5678")
    println(card.cardCheck())
}