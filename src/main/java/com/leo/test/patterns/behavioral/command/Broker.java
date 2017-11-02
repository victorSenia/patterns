package com.leo.test.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */

public class Broker {
    private final List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        orderList.stream().forEach(Order::execute);
        orderList.clear();
    }
}