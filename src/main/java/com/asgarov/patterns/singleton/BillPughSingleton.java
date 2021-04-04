package com.asgarov.patterns.singleton;

/**
 * my favourite solution - thanks to the JVM specification of loading nested static classes allows lazy loading
 *  without worrying about concurrency locking
 */
public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.instance;
    }
}
