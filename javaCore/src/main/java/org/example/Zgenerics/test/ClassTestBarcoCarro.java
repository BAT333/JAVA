package org.example.Zgenerics.test;

import org.example.Zgenerics.service.AlugarBarco;
import org.example.Zgenerics.service.AlugarCarro;

public class ClassTestBarcoCarro {
    public static void main(String[] args) {
        AlugarBarco barco = new AlugarBarco();
        barco.devolvendo(barco.alugar());

        AlugarCarro carro =new AlugarCarro();
        carro.devolvendo(carro.alugar());



    }
}
