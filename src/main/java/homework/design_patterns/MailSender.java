package homework.design_patterns;

public class MailSender {
    public void send(MailInfo mailInfo){
        MailTypes.handle(mailInfo);
    }
}
