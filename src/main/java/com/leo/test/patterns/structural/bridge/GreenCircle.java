package com.leo.test.patterns.structural.bridge;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}