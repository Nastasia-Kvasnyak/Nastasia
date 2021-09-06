package homework.lab_enums;

public enum HttpCode {
    INFORMATIONAL(100,199,new InformationalHandler()),
    SUCCESS(200,299,new SuccessHandler()),
    REDIRECTION(300,399,new RedirectionHandler()),
    CLIENT_ERROR(400,499,new ClientHandler()),
    SERVER_ERROR(500,599,new ServerHandler());

    private final int start;
    private final int end;
    private final HttpHandler httpHandler;

    HttpCode(int start, int end, HttpHandler httpHandler) {
        this.start = start;
        this.end = end;
        this.httpHandler = httpHandler;
    }

    public static void handle(int httpCode){
        for (HttpCode code : values()) {
                if ((httpCode<code.end)&&(httpCode>=code.start)){
                    code.httpHandler.handle(httpCode);
                    return;
                }
        }
        throw new IllegalStateException("code "+httpCode+" not supported");
    }
}
