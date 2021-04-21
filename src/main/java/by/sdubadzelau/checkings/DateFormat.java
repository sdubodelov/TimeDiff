package by.sdubadzelau.checkings;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) throws InterruptedException {
        Date now = new Date();
        System.out.println(now);
        Thread.sleep(1000);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZ");

        System.out.println(now.toInstant()
                .atZone(ZoneId.of("GMT"))
                .format(formatter));

        System.out.println(now.toInstant()
                .atZone(ZoneOffset.ofHours(-7))
                .format(formatter));

        System.out.println(new Date());
    }
}
