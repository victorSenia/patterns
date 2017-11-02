package com.leo.test.patterns.creational.abstractFactory;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
