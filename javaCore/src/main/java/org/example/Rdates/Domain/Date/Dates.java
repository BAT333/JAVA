package org.example.Rdates.Domain.Date;


import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        Date data = new Date();

        System.out.println(data);
        data.setTime(data.getTime()+3600000);

        System.out.println(data);

    }
}
