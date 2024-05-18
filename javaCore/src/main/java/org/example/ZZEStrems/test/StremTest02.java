package org.example.ZZEStrems.test;

import org.example.ZZClambdas.dominio.Anime;

import java.util.*;
import java.util.stream.Collectors;

public class StremTest02 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of(
                "rafael","rian","renan","raul","riana","radiador","amanda"
        ));

        List<List<String>> lists = new ArrayList<>();
        lists.add(names);
        lists.add(names);
        lists.add(names);

        lists.stream().flatMap(Collection::stream).collect(Collectors.toList()).forEach(System.out::println);

        List<String> strings =names.stream().map(n-> n.split("")).flatMap(Arrays::stream).distinct().toList();
        System.out.println(strings);



    }
}

