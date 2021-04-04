package com.asgarov.patterns.flyweight;

public class FixedSizeRobot extends Robot {

    public FixedSizeRobot() {
        super("A robot with a fixed size created");
    }

    @Override
    public void showMe(String color) {
        System.out.println(" with " + " blue (default) color");
    }
}
