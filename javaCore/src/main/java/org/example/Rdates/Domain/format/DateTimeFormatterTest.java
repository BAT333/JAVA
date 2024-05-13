package org.example.Rdates.Domain.format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy");
        System.out.println(localDateTime.format(dateTimeFormatter));
    }
}
