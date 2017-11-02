package com.leo.test.patterns.creational.prototype;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
