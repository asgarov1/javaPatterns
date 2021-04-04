package com.asgarov.patterns.builder;

import static com.asgarov.patterns.builder.Pizza.Topping.*;

public class Runner {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .addTopping(BACON)
                .addTopping(BACON)
                .addTopping(BACON)
                .addTopping(MUSHROOMS)
                .addTopping(CHEESE)
                .addTopping(CHEESE)
                .build();
        System.out.println(pizza);
    }
}

