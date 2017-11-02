package com.leo.test.patterns.behavioral.strategy;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
