package com.leo.test.patterns.creational.builder;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
