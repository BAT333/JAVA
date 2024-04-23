package org.example.Uregex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String message = "HelloHellolloHelloHelo";
        Pattern pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()){
            System.out.println(matcher.start());
            System.out.println(matcher.group());
        }
    }
}
