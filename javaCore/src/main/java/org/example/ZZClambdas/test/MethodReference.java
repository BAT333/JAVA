package org.example.ZZClambdas.test;

import org.example.ZZClambdas.dominio.Anime;
import org.example.ZZClambdas.service.AnimeComparators;

import java.util.*;

public class MethodReference {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("Boxe",5),
                new Anime("Luta",7),
                new Anime("Tiro",8),
                new Anime("Futuro",2)));
        Collections.sort(animes, Comparator.comparing(Anime::getName));

        // Collections.sort(animes,(o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(animes);
        Collections.sort(animes, AnimeComparators::compareByTitle);
        AnimeComparators animeComparators = new AnimeComparators();
        animes.sort(animeComparators::compareByTitleNoStatic);
        System.out.println(animes);

    }
}
