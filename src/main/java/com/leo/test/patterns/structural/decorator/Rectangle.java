package com.leo.test.patterns.structural.decorator;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
