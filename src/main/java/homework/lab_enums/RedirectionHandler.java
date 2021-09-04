package homework.lab_enums;

public class RedirectionHandler implements HttpHandler{
    @Override
    public void handle(int httpCode) {
        System.out.println("Redirection");
    }
}
