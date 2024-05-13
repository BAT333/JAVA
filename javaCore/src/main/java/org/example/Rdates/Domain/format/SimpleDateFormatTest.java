package org.example.Rdates.Domain.format;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        LocalDate date = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy");
        System.out.println(date.format(dateTimeFormatter));
        System.out.println(dateFormat.format(new Date()));

    }
}
