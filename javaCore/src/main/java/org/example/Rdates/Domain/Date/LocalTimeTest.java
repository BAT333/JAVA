package org.example.Rdates.Domain.Date;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime date = LocalTime.now();

        System.out.println(date.getHour());
    }
}
