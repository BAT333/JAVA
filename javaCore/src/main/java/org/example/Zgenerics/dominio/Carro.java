package org.example.Zgenerics.dominio;

public class Carro {
    String name;

    public Carro(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "name='" + name + '\'' +
                '}';
    }
}
