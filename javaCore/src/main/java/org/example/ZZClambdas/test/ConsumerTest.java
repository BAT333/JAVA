package org.example.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
       List<String> strings =  List.of("rafael","rian","renan","raul","riana","radiador");
       forEache(strings,s -> System.out.println(s.toUpperCase()));
    }
    private static <T> void forEache(List<T> tList, Consumer<T> tConsumer){

        for(T t: tList){
            tConsumer.accept(t);
        }
    }
}
