package org.example.ZZEStrems.test;

import org.example.ZZEStrems.dominio.Anime;
import org.example.ZZEStrems.dominio.Category;
import org.example.ZZEStrems.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class grupingByTest {
    public static void main(String[] args) {

        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("Boxe",5, Category.ACAO),
                new Anime("Luta",7,Category.ACAO),
                new Anime("Tiro",8,Category.ACAO),
                new Anime("Futuro",2,Category.AVENTURA),
                new Anime("dragon",3,Category.AVENTURA),
                new Anime("ball",9,Category.LUTA),
                new Anime("Boku",3,Category.ACAO),
                new Anime("akuil",3,Category.ETC),
                new Anime("heros",7,Category.AVENTURA)

        ));

        System.out.println( animes.stream().collect(Collectors.groupingBy(Anime::getCategory)));

        System.out.println( animes.stream().collect(Collectors.groupingBy(anime -> anime.getQuantity()>7? Promotion.YES: Promotion.NO)));
        System.out.println( animes.stream().collect(Collectors.groupingBy(anime -> anime.getQuantity()>7? Promotion.YES: Promotion.NO,Collectors.groupingBy(Anime::getCategory))));
        System.out.println( animes.stream().collect(Collectors.groupingBy(Anime::getCategory,Collectors.mapping(anime -> anime.getQuantity()>7? Promotion.YES: Promotion.NO,Collectors.toSet()))));

    }
}
