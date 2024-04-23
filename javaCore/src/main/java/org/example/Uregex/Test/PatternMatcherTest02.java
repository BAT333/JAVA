package org.example.Uregex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        String message = "He324lloHello535lloHello234Helo@";
        Pattern pattern = Pattern.compile("\\W");
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()){
            //System.out.println(matcher.start());
            System.out.println(matcher.group());
        }
    }
}
