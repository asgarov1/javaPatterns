package com.asgarov.patterns.prototype.car;

public class Sedan extends Car implements Cloneable {
    public Sedan(final int speed, final int seats, final String name) {
        super(speed, seats, name);
    }
}
