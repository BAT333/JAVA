package org.example.Rdates.Domain.format;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[8];
        df[0] = DateFormat.getDateInstance();
        df[1] = DateFormat.getInstance();
        df[2] = DateFormat.getTimeInstance();
        df[3] = DateFormat.getDateTimeInstance();
        df[4] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[5] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[6] = DateFormat.getDateInstance(DateFormat.LONG);
        df[7] = DateFormat.getDateInstance(DateFormat.FULL);


        for (DateFormat dateFormat:df){
            System.out.println(dateFormat.format(calendar.getTime()));
        }

    }
}
