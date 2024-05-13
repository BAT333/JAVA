package org.example.Rdates.Domain.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {
        long unit = ChronoUnit.DAYS.between(LocalDateTime.now(),LocalDateTime.now().plusYears(5));
        System.out.println(unit);
    }
}
