package org.example.ZZClambdas.test;

import org.example.ZZClambdas.dominio.Anime;
import org.example.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReference01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("Boxe",5),
                new Anime("Luta",7),
                new Anime("Tiro",8),
                new Anime("Futuro",2)));

        AnimeComparators animeComparators = new AnimeComparators();
        animes.sort(animeComparators::compareByTitleNoStatic);


    }
}
