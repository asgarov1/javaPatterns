package com.asgarov.patterns.prototype.car;

public class Minivan extends Car implements Cloneable {
    public Minivan(final int speed, final int seats, final String name) {
        super(speed, seats, name);
    }
}
