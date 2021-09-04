package homework.lab_enums;

public class ClientHandler implements HttpHandler{
    @Override
    public void handle(int httpCode) {
        System.out.println("Client error");
    }
}
