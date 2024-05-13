package org.example.Rdates.Domain.Date;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        calendar.add(Calendar.YEAR,5);
        System.out.println( calendar.getFirstDayOfWeek());
        System.out.println(year);
        System.out.println(calendar);

    }
}
