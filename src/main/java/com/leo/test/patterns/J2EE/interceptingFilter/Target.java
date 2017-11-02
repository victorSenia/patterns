package com.leo.test.patterns.J2EE.interceptingFilter;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
