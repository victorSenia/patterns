package com.leo.test.patterns.creational.factory;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
