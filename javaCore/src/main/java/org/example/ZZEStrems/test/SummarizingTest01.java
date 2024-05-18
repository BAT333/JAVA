package org.example.ZZEStrems.test;

import org.example.ZZClambdas.dominio.Anime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingTest01 {
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

        animes.stream().collect(Collectors.counting());
        animes.stream().max(Comparator.comparing(Anime::getQuantity));
        animes.stream().collect(Collectors.maxBy(Comparator.comparing(Anime::getQuantity)));
        System.out.println(animes.stream().collect(Collectors.summarizingDouble(Anime::getQuantity)) );






    }
}
