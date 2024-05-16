package org.example.ZZBcomportamento.Dominio;

public class Car {
    private String name = "Audi";
    private String color;
    private int valor;

    public Car(String color, int valor) {
        this.color = color;
        this.valor = valor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", valor=" + valor +
                '}';
    }
}
