package org.example.Rdates.Domain.Date;

import java.time.LocalDate;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(date.getYear());
    }
}
