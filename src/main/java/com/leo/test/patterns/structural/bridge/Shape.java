package com.leo.test.patterns.structural.bridge;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}