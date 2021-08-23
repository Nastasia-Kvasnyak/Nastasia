package enums.lab;

/**
 * @author Evgeny Borisov
 */
public class HttpService {

    public void handleHttpCode(int httpCode) {
        //todo finish the enum and this method
        System.out.println("Код запроса - "+httpCode);
    }

    public static void main(String[] args) {
        HttpService sth = new HttpService();
        sth.handleHttpCode(400);
    }
}
