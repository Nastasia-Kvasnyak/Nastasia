package homework.lab_enums;

public class InformationalHandler implements HttpHandler{
    @Override
    public void handle(int httpCode) {
        System.out.println(httpCode+" Informational");
    }
}
