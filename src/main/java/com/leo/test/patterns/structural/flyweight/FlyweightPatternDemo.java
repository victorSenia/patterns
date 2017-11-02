package com.leo.test.patterns.structural.flyweight;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class FlyweightPatternDemo {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(getRandom());
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return getRandom();
    }

    private static int getRandomY() {
        return getRandom();
    }

    private static int getRandom() {
        return (int) (Math.random() * 100);
    }
}
