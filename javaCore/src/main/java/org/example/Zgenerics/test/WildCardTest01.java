package org.example.Zgenerics.test;

abstract class Animal {
    public abstract void barulho();
}
 class Cachorro extends Animal {
     @Override
     public void barulho() {
         System.out.println("auau");
     }
 }
 class Gato extends Animal {
     @Override
     public void barulho() {
         System.out.println("miau miau ");
     }
 }
public class WildCardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro()};
        Gato[] gato = {new Gato(),new Gato()};
        printBarulho(gato);
        printBarulho(cachorros);


    }
    private static void printBarulho(Animal[] animals){
        for(Animal animal: animals){
            animal.barulho();
        }
    }

}
