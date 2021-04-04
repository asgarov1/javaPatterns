package com.asgarov.patterns.flyweight;

public class SmallRobot extends Robot{


    public SmallRobot() {
        super("A small robot created");
    }

    @Override
    public void showMe(String color) {
        System.out.println(" with " + color + " color");
    }
}
