package org.example.Ycolecoes.Test;

import org.example.Ycolecoes.dominio.Person;

import java.beans.PersistenceDelegate;
import java.util.ArrayList;
import java.util.List;

public class EqualsTest01 {
    public static void main(String[] args) {
        String name = "Rafael";
        String name2 = "Rafael";
        String name3  = new String("Rafael");
        System.out.println(name == name2); //true
        System.out.println(name == name3);//false
        System.out.println(name.equals(name3));// true

        Person person = new Person("1234","Rafael");
        Person person2 = new Person("1234","Rafael");
        System.out.println(person2.equals(person));// false

        List<String> strings = new ArrayList<>();

    }
}
