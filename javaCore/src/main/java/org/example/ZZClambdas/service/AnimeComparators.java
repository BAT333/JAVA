package org.example.ZZClambdas.service;

import org.example.ZZClambdas.dominio.Anime;

public class AnimeComparators {

    public static int compareByTitle(Anime a1, Anime a2){
        return a1.getName().compareTo(a2.getName());
    }
    public  int compareByTitleNoStatic(Anime a1, Anime a2){
        return a1.getName().compareTo(a2.getName());
    }
}
