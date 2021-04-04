package com.asgarov.patterns.factoryMethod.factory;

import com.asgarov.patterns.factoryMethod.animal.Animal;
import com.asgarov.patterns.factoryMethod.animal.Dog;

public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
