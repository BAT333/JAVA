package org.example.ZZEStrems.test;

import org.example.ZZClambdas.dominio.Anime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StremTest01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("Boxe",5),
                new Anime("Luta",7),
                new Anime("Tiro",8),
                new Anime("Futuro",2),
                new Anime("dragon",3),
                new Anime("ball",9),
                new Anime("Boku",3),
                new Anime("akuil",3),
                new Anime("heros",7)

        ));
        List<Anime> anime = new ArrayList<>();

        animes.sort(Comparator.comparing(Anime::getName));
        for (int i =0;i< animes.size();i++){
            if(animes.get(i).getQuantity()<4){
                anime.add(animes.get(i));
                if(i>=3){
                    break;
                }
            }
        }
        System.out.println(anime);


        animes.stream().
                sorted(Comparator.comparing(Anime::getName)).
                filter(a->a.getQuantity()<4)
                .limit(3)
                .map(Anime::getName)
                .toList().
                forEach(System.out::println);


        Long aLong =  animes.stream().
                sorted(Comparator.comparing(Anime::getName)).
                distinct().
                filter(a->a.getQuantity()<4)
                .limit(3)
                .map(Anime::getName)
                .count();
        System.out.println(aLong);


    }
}

