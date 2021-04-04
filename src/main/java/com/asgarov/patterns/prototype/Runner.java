package com.asgarov.patterns.prototype;

import com.asgarov.patterns.prototype.car.Car;
import com.asgarov.patterns.prototype.car.Minivan;
import com.asgarov.patterns.prototype.car.Sedan;
import com.asgarov.patterns.prototype.car.Truck;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws CloneNotSupportedException {
        List<Car> cars = new ArrayList<>();

        Car mercedezE = new Sedan(250, 5, "Mercedez E class");
        cars.add(mercedezE);
        cars.add((Car) mercedezE.clone());

        Car mercedezViano = new Minivan(180, 9, "Mercedez Viano");
        cars.add(mercedezViano);
        cars.add((Car) mercedezViano.clone());
        cars.add((Car) mercedezViano.clone());

        Car truck = new Truck(120, 3, "Kamaz");
        cars.add(truck);
        cars.add((Car)truck.clone());

        cars.forEach(System.out::println);
        System.out.println(cars.get(0) == cars.get(1));
    }
}
