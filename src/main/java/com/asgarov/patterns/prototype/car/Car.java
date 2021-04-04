package com.asgarov.patterns.prototype.car;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Car implements Cloneable {
    final int speed;
    final int seats;
    final String name;

    public Car(final int speed, final int seats, final String name) {
        this.speed = speed;
        this.seats = seats;
        this.name = name;
    }

    @Override public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", seats=" + seats +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Map<String, Integer> collect = Stream.of("cat", "dog", "apple", "cat")
                .collect(Collectors.toMap(Function.identity(), String::length));

        System.out.println(collect);
    }
}
