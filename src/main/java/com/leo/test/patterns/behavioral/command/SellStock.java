package com.leo.test.patterns.behavioral.command;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
