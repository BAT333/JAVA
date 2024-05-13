package org.example.Rdates.Domain.Date;

import java.time.*;
import java.util.Map;

public class ZoneTest {
    public static void main(String[] args) {
        Map<String,String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        System.out.println(zoneId);
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        System.out.println(zonedDateTime);
        Instant instant = Instant.now();
        System.out.println(instant);
       ZonedDateTime zonedDateTime1 = instant.atZone(zoneId);
        System.out.println(zonedDateTime1);

        ZoneOffset offset = ZoneOffset.of("-04:00");
        System.out.println(localDateTime.atOffset(offset));


    }
}
