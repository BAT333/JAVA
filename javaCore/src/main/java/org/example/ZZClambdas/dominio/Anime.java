package org.example.ZZClambdas.dominio;

public class Anime {
    private String name;
    private int quantity;

    public Anime(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
