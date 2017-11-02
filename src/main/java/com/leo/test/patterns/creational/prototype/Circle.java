package com.leo.test.patterns.creational.prototype;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
