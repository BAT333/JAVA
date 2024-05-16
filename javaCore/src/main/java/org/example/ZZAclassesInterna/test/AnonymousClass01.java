package org.example.ZZAclassesInterna.test;
class Animals {
    public void walk(){
        System.out.println("Animal");
    }
}
public class AnonymousClass01 {
    public static void main(String[] args) {
        Animals animals = new Animals(){
            @Override
            public void walk() {
                System.out.println("dog");
            }
        };
        animals.walk();


    }

}
