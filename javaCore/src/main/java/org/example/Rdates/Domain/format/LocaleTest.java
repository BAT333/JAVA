package org.example.Rdates.Domain.format;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {


        Locale locale = Locale.US;
        Locale locale1 = new Locale("it", "IT");
        Calendar calendar = Calendar.getInstance();

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, locale1);
        //como deve ser formatado na us
        System.out.println(dateFormat2.format(calendar.getTime()));
        System.out.println(dateFormat.format(calendar.getTime()));

        System.out.println(locale1.getDisplayCountry());

        System.out.println(locale1.getDisplayCountry(locale));


    }

}
