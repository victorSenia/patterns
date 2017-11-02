package com.leo.test.patterns.creational.abstractFactory;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}