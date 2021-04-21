package by.sdubadzelau.checkings;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class TimeDifferences {

    public static void main(String[] args) {
        ZonedDateTime first = ZonedDateTime.parse("2021-03-05T00:00:00.000 GMT", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS z"));
        System.out.println("first date:" + first.withZoneSameInstant(ZoneId.of("GMT")));


        ZonedDateTime thoseTTETime = ZonedDateTime.parse("2021-02-21T16:40:00.001 PST", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS z"));
        System.out.println("thoseTTETime:" + thoseTTETime.withZoneSameInstant(ZoneId.of("GMT")));

        System.out.println("Queue TTE: " + thoseTTETime.plusDays(10).plusHours(23).plusMinutes(20).withZoneSameInstant(ZoneId.of("GMT")));


        ZonedDateTime detailPage_TTE_Time = ZonedDateTime.parse("2021-03-05T02:00:00.000 GMT", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS z"));
        System.out.println("detailPage_TTE_Time:" + detailPage_TTE_Time.withZoneSameInstant(ZoneId.of("GMT")));

        System.out.println("Details page TTE: " + detailPage_TTE_Time.plusDays(11).plusHours(1).plusMinutes(19).withZoneSameInstant(ZoneId.of("GMT")));

        System.out.println("==============================================================================================");
        System.out.println("TTE from decision service: " + thoseTTETime.plusDays(11).plusHours(1).plusMinutes(19).withZoneSameInstant(ZoneId.of("GMT")));

    }
}
