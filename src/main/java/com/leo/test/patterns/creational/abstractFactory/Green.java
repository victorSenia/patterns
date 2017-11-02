package com.leo.test.patterns.creational.abstractFactory;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}