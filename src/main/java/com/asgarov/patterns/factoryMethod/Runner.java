package com.asgarov.patterns.factoryMethod;

import com.asgarov.patterns.factoryMethod.factory.DogFactory;
import com.asgarov.patterns.factoryMethod.factory.TigerFactory;

public class Runner {
    public static void main(String[] args) {
        new TigerFactory().makeAnimal();
        new DogFactory().makeAnimal();
    }
}
