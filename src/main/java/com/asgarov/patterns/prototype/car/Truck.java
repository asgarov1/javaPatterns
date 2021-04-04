package com.asgarov.patterns.prototype.car;

public class Truck extends Car implements Cloneable {

    public Truck(final int speed, final int seats, final String name) {
        super(speed, seats, name);
    }
}
