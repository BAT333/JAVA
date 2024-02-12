package CLASSES;

import java.util.Objects;

public class Stores implements Comparable<Stores> {
    private String name;
    private double cost;

    public Stores(){

    }
    public Stores(String name, double cost){
        this.name = name;

        this.cost = cost;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getCost(){
        return cost;
    }
    public void setCost(double cost){
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)return false ;
        if(this == obj)return false;
        if(this.getClass() != obj.getClass())return false ;
        Stores s = (Stores) obj;
        return name !=null&& name.equals(s.name)&& cost == s.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,cost);
    }


    @Override
    public int compareTo(Stores stores) {
        if(cost>stores.cost){
            return -1;
        }else if(cost == stores.cost){
            return 0;
        }else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Stores{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

}
