package org.example.Ycolecoes.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String cpf;
    private String name;

    public Person(String cpf, String name){
        this.cpf = cpf;
        this.name = name;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)return false ;
        if(this == obj)return true ;
        if(this.getClass() != obj.getClass())return false;
        Person person = (Person) obj;
        return this.cpf != null && this.cpf.equals(person.cpf);
    }

    @Override
    public int hashCode() {
        //return this.cpf == null ? 0 : this.cpf.hashCode();
        return Objects.hash(this.cpf);
    }
}
