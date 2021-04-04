package com.asgarov.patterns.proxy;

public class ConcreteSubject extends Subject{
    @Override
    public void doSomeWork() {
        System.out.println("doSomeWork() inside ConcreteSubject is invoked.");
    }
}
