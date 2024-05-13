package org.example.Rdates.Domain.format;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest2 {
    public static void main(String[] args) {


        System.out.println(Locale.getDefault());

        String[] isoCountries = Locale.getISOCountries();

        String[] isoLanguages = Locale.getISOLanguages();

        for (String countries: isoCountries){
            System.out.print(countries);
        }
        System.out.println();
        for (String languages:isoLanguages){
            System.out.print(languages);
        }


    }

}
