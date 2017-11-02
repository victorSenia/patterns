package com.leo.test.patterns.behavioral.state;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}