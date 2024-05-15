package org.example.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(54);
        list.add("RAfael");
        list.add(54L);

        for (Object o:list){
            if(o instanceof  String){
                System.out.println(o);
            }
        }
    }
}
