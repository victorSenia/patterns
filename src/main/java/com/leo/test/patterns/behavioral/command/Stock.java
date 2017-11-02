package com.leo.test.patterns.behavioral.command;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Stock {
    private String name = "ABC";

    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ",  Quantity:" + quantity +"]bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ",  Quantity:" + quantity +"]sold ");
    }
}
