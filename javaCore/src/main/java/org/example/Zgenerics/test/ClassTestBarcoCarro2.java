package org.example.Zgenerics.test;

import org.example.Zgenerics.dominio.Barco;
import org.example.Zgenerics.dominio.Carro;
import org.example.Zgenerics.service.Alugar;
import org.example.Zgenerics.service.AlugarBarco;
import org.example.Zgenerics.service.AlugarCarro;

import java.util.ArrayList;
import java.util.List;

public class ClassTestBarcoCarro2 {
    public static void main(String[] args) {
        List<Barco> barcos =new ArrayList<>(List.of(new Barco("canoa"),new Barco("lancha")));
        Alugar<Barco> barcoAlugar = new Alugar<>(barcos);
        barcoAlugar.devolvendo(barcoAlugar.alugar());

        List<Carro> carros =new ArrayList<>(List.of(new Carro("BMW"),new Carro("FUSCA")));
        Alugar<Carro> carroAlugar = new Alugar<>(carros);
        carroAlugar.devolvendo(carroAlugar.alugar());



    }
}
