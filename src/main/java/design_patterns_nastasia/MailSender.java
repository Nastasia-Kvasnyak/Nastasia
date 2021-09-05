package design_patterns_nastasia;

public class MailSender {

    public void send(MailInfo mailInfo){
        MailTypes.handle(mailInfo);
    }
}
