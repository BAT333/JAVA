package org.example.Zgenerics.service;

import org.example.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class AlugarCarro {
    List<Carro> carros =new ArrayList<>(List.of(new Carro("BMW"),new Carro("FUSCA")));

    public Carro alugar(){
        System.out.println("Buscando Carro");
        Carro carroALugar = carros.remove(1);
        System.out.println("Carro Alugado "+ carroALugar);
        System.out.println("Carros: "+ carros);
        return carroALugar;
    }
    public void devolvendo (Carro carro){
        System.out.println("Devolvendo carro");
        carros.add(carro);
        System.out.println("Carro disponivel: "+ carros);
    }

}
