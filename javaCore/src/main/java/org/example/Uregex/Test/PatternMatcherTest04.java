package org.example.Uregex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        String message = "12 0X324 0XAF 0XIS 0XZ  1X44S";
        Pattern pattern = Pattern.compile("0[xX]([0-9a-fA-F])+(\\s|$)");
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()){
            System.out.println(matcher.start());
            System.out.println(matcher.group());
        }
    }
}
