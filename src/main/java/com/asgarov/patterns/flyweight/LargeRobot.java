package com.asgarov.patterns.flyweight;

public class LargeRobot extends Robot {

    public LargeRobot() {
        super("A large robot created");
    }

    @Override
    public void showMe(String color) {
        System.out.println(" with " + color + " color");
    }
}
