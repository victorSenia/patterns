package com.leo.test.patterns.J2EE.frontController;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
