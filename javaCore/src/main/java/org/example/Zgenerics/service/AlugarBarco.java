package org.example.Zgenerics.service;

import org.example.Zgenerics.dominio.Barco;
import org.example.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class AlugarBarco {
    List<Barco> barcos =new ArrayList<>(List.of(new Barco("canoa"),new Barco("lancha")));

    public Barco alugar(){
        System.out.println("Buscando barco");
        Barco barco = barcos.remove(1);
        System.out.println("barco Alugado "+ barco);
        System.out.println("barco: "+ barcos);
        return barco;
    }
    public void devolvendo (Barco barco){
        System.out.println("Devolvendo barco");
        barcos.add(barco);
        System.out.println("barco disponivel: "+ barcos );
    }

}
