package org.example.ZZBcomportamento.interfece;

import org.example.ZZBcomportamento.Dominio.Car;

import java.util.List;

public interface CarPredicate <T> {
     boolean filter(T t);
}
