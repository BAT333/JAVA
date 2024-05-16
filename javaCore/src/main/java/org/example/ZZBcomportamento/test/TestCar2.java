package org.example.ZZBcomportamento.test;

import org.example.ZZBcomportamento.Dominio.Car;
import org.example.ZZBcomportamento.interfece.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class TestCar2 {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("green",2000),
                new Car("pink",75589),
                new Car("red",77865),
                new Car("black",87555),
                new Car("green",5000));
        filteres(cars,car -> car.getColor().equalsIgnoreCase("black")).forEach(System.out::println);
        filter(cars, new CarPredicate<Car>() {
            @Override
            public boolean filter(Car car) {
                return car.getColor().equalsIgnoreCase("green");
            }
        }).forEach(System.out::println);

    }
    private static List<Car> filter(List<Car> cars,CarPredicate<Car> carPredicate){
        List<Car> carRetorn = new ArrayList<>();
        for(Car car:cars){
            if(carPredicate.filter(car)){
                carRetorn.add(car);
            }
        }
        return carRetorn;
    }

    private static<T> List<T> filteres(List<T> list,CarPredicate<T> filter){
        List<T> listRetorn = new ArrayList<>();
        for(T ts:list){
            if(filter.filter(ts)){
                listRetorn.add(ts);
            }
        }
        return listRetorn;
    }
}
