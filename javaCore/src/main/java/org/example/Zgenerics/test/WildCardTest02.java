package org.example.Zgenerics.test;


import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro());
        List<Gato> gato =List.of (new Gato(),new Gato());
       // printBarulho(gato);//erro



    }
    private static void printBarulho(List<Animal> animals){
        for(Animal animal: animals){
            animal.barulho();
        }
    }

}
