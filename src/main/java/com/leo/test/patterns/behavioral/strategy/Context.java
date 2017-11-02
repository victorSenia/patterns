package com.leo.test.patterns.behavioral.strategy;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
