package org.example.Rdates.Domain.format;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatcoinTest {
    public static void main(String[] args) {
        Locale locale = Locale.US;
        Locale locale1 = Locale.UK;
        Locale locale2 = Locale.CHINESE;
        Locale locale3 = Locale.GERMANY;
        NumberFormat[] numberFormats = new  NumberFormat[4];
        numberFormats[0]= NumberFormat.getCurrencyInstance(locale);
        numberFormats[1]= NumberFormat.getCurrencyInstance(locale1);
        numberFormats[2]= NumberFormat.getCurrencyInstance(locale2);
        numberFormats[3]= NumberFormat.getCurrencyInstance(locale3);
        for (NumberFormat format: numberFormats){
            System.out.println(format.format(50888844655L));
        }

    }
}
