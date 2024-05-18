package org.example.ZZClambdas.test;

import org.example.ZZClambdas.dominio.Anime;
import org.example.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReference04 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("Boxe",5),
                new Anime("Luta",7),
                new Anime("Tiro",8),
                new Anime("Futuro",2)));
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;
        AnimeComparators animeComparators = animeComparatorsSupplier.get();

        animes.sort(animeComparators::compareByTitleNoStatic);
        System.out.println(animes);

        BiFunction<String,Integer,Anime> function= Anime::new;

    }
}
