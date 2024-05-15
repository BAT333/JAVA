package org.example.Zgenerics.dominio;

import java.util.ArrayList;


public class Barco {
    String name;

    public Barco(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "name='" + name + '\'' +
                '}';
    }
}
