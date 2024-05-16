package org.example.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
       List<String> strings =  List.of("rafael","rian","renan","raul","riana","radiador");
       forEache(strings, String::length).forEach(System.out::println);
        forEache(strings, String::toUpperCase).forEach(System.out::println);
    }
    private static <T,R> List<R> forEache(List<T> tList, Function<T,R> trFunction){
        List<R> rList = new ArrayList<>();
        for(T t: tList){
           rList.add( trFunction.apply(t));
        }
        return rList;
    }
}
