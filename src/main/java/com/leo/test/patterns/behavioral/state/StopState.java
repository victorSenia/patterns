package com.leo.test.patterns.behavioral.state;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}