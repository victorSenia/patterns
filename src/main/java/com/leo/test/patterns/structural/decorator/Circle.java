package com.leo.test.patterns.structural.decorator;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
