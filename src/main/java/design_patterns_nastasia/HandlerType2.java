package design_patterns_nastasia;

public class HandlerType2 implements MailHandler {
    @Override
    public void handle(MailInfo mailInfo) {
        //
        System.out.println("Happy birthday message "+mailInfo.getContent());
    }
}
