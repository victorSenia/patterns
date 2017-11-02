package com.leo.test.patterns.behavioral.memento;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}