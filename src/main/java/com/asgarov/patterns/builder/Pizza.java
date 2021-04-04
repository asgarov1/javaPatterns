package com.asgarov.patterns.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Pizza {

    public enum Topping {CHEESE, BACON, PINEAPPLE, MUSHROOMS, SEA_PRODUCTS}

    final Map<Topping, Long> toppings;

    public static class Builder {
        private final List<Topping> toppings = new ArrayList<>();

        public Builder addTopping(Topping topping) {
            toppings.add(topping);
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        toppings = builder.toppings
                .stream()
                .collect(groupingBy(Function.identity(), Collectors.counting()));
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings=" + toppings +
                '}';
    }
}
