package com.leo.test.patterns.J2EE.serviceLocator;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Service1 implements Service {
    public void execute() {
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
