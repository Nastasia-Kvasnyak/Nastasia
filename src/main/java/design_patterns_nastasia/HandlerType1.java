package design_patterns_nastasia;

public class HandlerType1 implements MailHandler {
    @Override
    public void handle(MailInfo mailInfo) {
        //
        System.out.println("Welcome message "+mailInfo.getContent());
    }
}
