package homework.lab_enums;

public class HttpService {

    public void handleHttpCode(int httpCode){
        HttpCode.handle(httpCode);
    }

    public static void main(String[] args) {
        HttpService httpService = new HttpService();
        httpService.handleHttpCode(567);
    }
}
