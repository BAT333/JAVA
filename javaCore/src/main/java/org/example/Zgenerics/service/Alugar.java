package org.example.Zgenerics.service;

import org.example.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class Alugar<T> {
   private  List<T> tList =new ArrayList<>();
   public Alugar(List<T> tList){
     this.tList = tList;
   }

    public T alugar(){
        System.out.println("Buscando objeto");
        T t = tList.remove(1);
        System.out.println("objeto Alugado "+ t);
        System.out.println("barco: "+ tList);
        return t;
    }
    public void devolvendo (T t){
        System.out.println("Devolvendo objeto");
        tList.add(t);
        System.out.println("barco disponivel: "+ tList );
    }

}
