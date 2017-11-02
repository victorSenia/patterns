package com.leo.test.patterns.behavioral.mediator;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
