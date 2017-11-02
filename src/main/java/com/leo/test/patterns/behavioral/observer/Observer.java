package com.leo.test.patterns.behavioral.observer;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
