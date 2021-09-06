package homework.design_patterns;

public class HandlerType2 implements MailHandler {
    @Override
    public void handle(MailInfo mailInfo) {
        //
        System.out.println("Happy birthday message "+mailInfo.getContent());
    }
}
