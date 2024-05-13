package org.example.Rdates.Domain.Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        date = date.withMonth(10);
        date = date.withDayOfMonth(1);
        System.out.println(date);

        //---------------
       date = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(date);
        date = date.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println(date);
        date = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(date);
        date = date.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(date);


    }
}
