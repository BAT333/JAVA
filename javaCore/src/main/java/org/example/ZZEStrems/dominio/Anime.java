package org.example.ZZEStrems.dominio;

public class Anime {
    private String name;
    private int quantity;
    private Category category;

    public Anime(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    public Anime(String name, int quantity,Category category) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
