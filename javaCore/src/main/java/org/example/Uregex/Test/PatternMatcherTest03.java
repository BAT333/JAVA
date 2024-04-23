package org.example.Uregex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        String message = "Cafe è bom";
        Pattern pattern = Pattern.compile("[abAcC]");
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()){
            System.out.println(matcher.start());
            System.out.println(matcher.group());
        }
    }
}
