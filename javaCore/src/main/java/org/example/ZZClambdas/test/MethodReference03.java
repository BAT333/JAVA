package org.example.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReference03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of(
                "rafael","rian","renan","raul","riana","radiador","amanda"
        ));
        names.sort(String::compareTo);
        System.out.println(names);
        Function<String,Integer> stringIntegerFunction= String::length;
        names.forEach(n-> System.out.println(stringIntegerFunction.apply(n)));


        BiPredicate<List<String>,String> checkName= List::contains;
        System.out.println(checkName.test(names,"rafael"));


    }
}
