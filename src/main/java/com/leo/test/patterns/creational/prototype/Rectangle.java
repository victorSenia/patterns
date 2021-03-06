package com.leo.test.patterns.creational.prototype;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
