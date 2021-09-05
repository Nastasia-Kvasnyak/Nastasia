package design_patterns_nastasia;

public enum MailTypes {
    WELCOME(1,new HandlerType1()),BIRTHDAY(2,new HandlerType2());

    private final int mailType;
    private final MailHandler mailHandler;


    MailTypes(int mailType, MailHandler mailHandler) {
        this.mailType = mailType;
        this.mailHandler = mailHandler;
    }

    public static void handle(MailInfo mailInfo){
        for (MailTypes value : MailTypes.values()) {
            if (mailInfo.getMailType()== value.mailType){
                value.mailHandler.handle(mailInfo);
        }
//            throw new IllegalStateException(" No such type");
    }
    }

}
