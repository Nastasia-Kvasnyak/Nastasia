package homework.lab2.nastasiaBuilder;
/*
* builder for client
* */

public class Main {
    public static void main(String[] args) {
       Client client = Client.builder()
               .name("Nastya")
               .salary(77)
               .debt(10)
               .bonus(5)
               .build();
        System.out.println(client);
    }
}
