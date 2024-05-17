package org.example.ZZDoptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class optionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.ofNullable(findByName("cabea"));
        o1.ifPresent(s-> System.out.println(s.toUpperCase()));
       //o1.orElseThrow(() -> new RuntimeException("nome não encontrado"));
       // o1.ifPresentOrElse(s-> System.out.println(s.toUpperCase()),() -> System.out.println(findByName("cabeça")));
       // System.out.println(o1.orElseGet(() -> "ola"));
       // System.out.println(o1.orElse("Vazio"));

    }
    private static String findByName(String name){
        List<String> names = new ArrayList<>(List.of(
                "rafael","rian","renan","raul","cabeça","radiador","amanda"
        ));
        int i = names.indexOf(name);

        if(i >=0){
            return names.get(i);
        }
        return null;

    }
}
