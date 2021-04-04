package com.asgarov.patterns.adapter;

public class Runner {
    public static void main(String[] args) {
        var calculatorAdapter = new CalculatorAdapter();
        Triangle triangle = new Triangle(20, 10);
        System.out.println("Area of triangle is " + calculatorAdapter.getArea(triangle));
    }
}
