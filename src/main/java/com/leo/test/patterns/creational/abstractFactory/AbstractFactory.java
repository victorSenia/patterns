package com.leo.test.patterns.creational.abstractFactory;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
