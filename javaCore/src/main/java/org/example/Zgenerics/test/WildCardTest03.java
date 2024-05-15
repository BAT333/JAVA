package org.example.Zgenerics.test;


import java.util.List;

public class WildCardTest03 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro());
        List<Gato> gato =List.of (new Gato(),new Gato());
        printBarulho(gato);//erro
        printBarulho(gato);
        printBarulho(cachorros);




    }
    private static void printBarulho(List<? extends Animal> animals){
        for(Animal animal: animals){
            animal.barulho();
        }
    }
    private static void printBarulho2(List<? super Animal> animals){
        for(Object animal: animals){
            if(animal instanceof Animal){
              Animal  a = (Animal) animal;
              a.barulho();
            }
        }
    }

}
