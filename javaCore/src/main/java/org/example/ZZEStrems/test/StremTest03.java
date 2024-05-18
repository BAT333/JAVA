package org.example.ZZEStrems.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StremTest03 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(List.of(
              1,2,34,65,56,745,32,4,3,123,54,512,3,343234,42,23,32
        ));

        number.stream().reduce((n1, n2) -> n1+n2 );
        System.out.println(number.stream().reduce(Integer::sum));
        System.out.println(number.stream().reduce(Integer::min));
        System.out.println(number.stream().reduce(Integer::max));
        System.out.println(number.stream().reduce((n1, n2) -> n1-n2));
        System.out.println(number.stream().reduce((n1, n2) -> n1*n2));





    }
}

