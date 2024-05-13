package org.example.Rdates.Domain.format;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        Locale locale = Locale.US;
        Locale locale1 = Locale.UK;
        Locale locale2 = Locale.CHINESE;
        Locale locale3 = Locale.GERMANY;
        NumberFormat[] numberFormats = new  NumberFormat[20];
        numberFormats[0]= NumberFormat.getInstance(locale);
        numberFormats[1]= NumberFormat.getInstance(locale1);
        numberFormats[2]= NumberFormat.getInstance(locale2);
        numberFormats[3]= NumberFormat.getInstance(locale3);

        numberFormats[4]= NumberFormat.getNumberInstance(locale);
        numberFormats[5]= NumberFormat.getNumberInstance(locale1);
        numberFormats[6]= NumberFormat.getNumberInstance(locale2);
        numberFormats[7]= NumberFormat.getNumberInstance(locale3);

        numberFormats[8]= NumberFormat.getCurrencyInstance(locale);
        numberFormats[9]= NumberFormat.getCurrencyInstance(locale1);
        numberFormats[10]= NumberFormat.getCurrencyInstance(locale2);
        numberFormats[11]= NumberFormat.getCurrencyInstance(locale3);

        numberFormats[12]= NumberFormat.getIntegerInstance(locale);
        numberFormats[13]= NumberFormat.getIntegerInstance(locale1);
        numberFormats[14]= NumberFormat.getIntegerInstance(locale2);
        numberFormats[15]= NumberFormat.getIntegerInstance(locale3);

        numberFormats[16]= NumberFormat.getPercentInstance(locale);
        numberFormats[17]= NumberFormat.getPercentInstance(locale1);
        numberFormats[18]= NumberFormat.getPercentInstance(locale2);
        numberFormats[19]= NumberFormat.getPercentInstance(locale3);



        for (NumberFormat format: numberFormats){
            System.out.println(format.format(50888844655L));
        }

    }
}
