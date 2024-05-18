package org.example.ZZEStrems.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StremTest04 {
    public static void main(String[] args) {


        IntStream.rangeClosed(1,50).filter(n -> n%2==0).forEach(System.out::println);
        IntStream.range(1,50).filter(n -> n%2==0).forEach(System.out::println);

        int num[] = {1,12,4,8};
        System.out.println(Arrays.stream(num));


        try {
           Files.lines(Paths.get("text")).filter(l-> l.contains("java")).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {

        }
        Stream.iterate(1,n-> n+1).forEach(System.out::println);

    }
}

