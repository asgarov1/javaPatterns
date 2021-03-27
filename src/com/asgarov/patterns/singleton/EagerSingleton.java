package com.asgarov.patterns.singleton;

public final class EagerSingleton {

    private static final EagerSingleton captain = new EagerSingleton();

    private EagerSingleton() { }

    public static EagerSingleton getInstance() {
        return captain;
    }
}
