package com.leo.test.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class CareTaker {
    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}