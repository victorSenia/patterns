package com.leo.test.patterns.behavioral.interpreter;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public interface Expression {
    boolean interpret(String context);
}
