package com.asgarov.patterns.adapter;

public class CalculatorAdapter {
    public double getArea(Triangle triangle) {
        Calculator calculator = new Calculator();
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(triangle.getBase());
        rectangle.setWidth(0.5 * triangle.getHeight());
        return calculator.getArea(rectangle);
    }
}
