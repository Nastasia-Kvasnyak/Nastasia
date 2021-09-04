package homework.lab_enums;

public class ServerHandler implements HttpHandler{
    @Override
    public void handle(int httpCode) {
        System.out.println("Server error");
    }
}
