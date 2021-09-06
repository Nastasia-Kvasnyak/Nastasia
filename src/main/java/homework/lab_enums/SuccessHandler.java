package homework.lab_enums;

public class SuccessHandler implements HttpHandler{
    @Override
    public void handle(int httpCode) {
        System.out.println(httpCode+" Success");
    }
}
