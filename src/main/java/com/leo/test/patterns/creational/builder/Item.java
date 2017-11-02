package com.leo.test.patterns.creational.builder;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public interface Item {
    String name();

    Packing packing();

    float price();
}
