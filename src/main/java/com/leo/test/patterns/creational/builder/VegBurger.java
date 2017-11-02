package com.leo.test.patterns.creational.builder;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
