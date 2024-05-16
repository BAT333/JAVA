package org.example.ZZBcomportamento.test;

import org.example.ZZBcomportamento.Dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class TestCar {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("green",2000),
                new Car("pink",75589),
                new Car("red",77865),
                new Car("black",87555),
                new Car("green",5000));
        filterCar(cars,"black").forEach(System.out::println);


    }
    private static List<Car> filterCar(List<Car> cars){
        List<Car> carRetorn = new ArrayList<>();
        for(Car car:cars){
            if(car.getColor().equalsIgnoreCase("green")){
                carRetorn.add(car);
            }
        }
        return carRetorn;
    }
    private static List<Car> filterCar(List<Car> cars,String color){
        List<Car> carRetorn = new ArrayList<>();
        for(Car car:cars){
            if(car.getColor().equalsIgnoreCase(color)){
                carRetorn.add(car);
            }
        }
        return carRetorn;
    }
}
