package com.asgarov.patterns.flyweight;

public abstract class Robot {
    final String robotTypeCreated;

    public Robot(String robotTypeCreated) {
        this.robotTypeCreated = robotTypeCreated;
        System.out.println(robotTypeCreated);
    }

    public abstract void showMe(String color);
}
