package com.asgarov.patterns.factoryMethod.factory;

import com.asgarov.patterns.factoryMethod.animal.Animal;

public abstract class AnimalFactory {
    public abstract Animal createAnimal();

    public Animal makeAnimal() {
        Animal animal = createAnimal();
        animal.speak();
        animal.preferredAction();
        return animal;
    };
}
