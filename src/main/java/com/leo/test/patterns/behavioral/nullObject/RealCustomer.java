package com.leo.test.patterns.behavioral.nullObject;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
