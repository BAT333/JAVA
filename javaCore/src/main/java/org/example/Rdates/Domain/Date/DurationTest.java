package org.example.Rdates.Domain.Date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.now().plusYears(5).plusMonths(8).minusHours(5);
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.now().plusMinutes(50);

        Duration duration=  Duration.between(localDateTime,localDateTime1);
        Duration duration2=  Duration.between(localTime,localTime1);
        System.out.println(duration2);

    }
}
