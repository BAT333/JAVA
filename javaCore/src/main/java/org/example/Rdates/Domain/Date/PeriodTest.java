package org.example.Rdates.Domain.Date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.now().plusDays(4).plusMonths(8);
        System.out.println(Period.ofMonths(5));
        System.out.println(Period.ofDays(5));
        System.out.println(Period.ofYears(5));
        System.out.println(Period.ofWeeks(5));
        System.out.println(Period.between(date1,date));

    }
}
