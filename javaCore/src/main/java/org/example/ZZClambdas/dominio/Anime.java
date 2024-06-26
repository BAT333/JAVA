package org.example.ZZClambdas.dominio;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anime anime = (Anime) o;
        return quantity == anime.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash( quantity);
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
