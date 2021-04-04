package com.asgarov.patterns.factoryMethod.factory;

import com.asgarov.patterns.factoryMethod.animal.Animal;
import com.asgarov.patterns.factoryMethod.animal.Tiger;

public class TigerFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
}
