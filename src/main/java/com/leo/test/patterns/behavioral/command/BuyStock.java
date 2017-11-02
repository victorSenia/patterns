package com.leo.test.patterns.behavioral.command;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class BuyStock implements Order {
    private final Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
