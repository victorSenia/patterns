package com.leo.test.patterns.J2EE.frontController;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Dispatcher {
    private StudentView studentView;

    private HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}