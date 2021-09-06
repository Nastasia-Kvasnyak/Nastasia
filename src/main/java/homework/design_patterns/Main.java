package homework.design_patterns;

import com.github.javafaker.Faker;
import homework.lab3.utils.RandomUtil;
import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        MailSender mailSender = new MailSender();
        Faker faker = new Faker();
        while (true){
            MailInfo mailInfo = MailInfo.builder()
                    .mailType(RandomUtil.between(1,2))
                    .content(faker.chuckNorris().fact())
                    .build();
            mailSender.send(mailInfo);

            Thread.sleep(2000);
        }
    }
}
