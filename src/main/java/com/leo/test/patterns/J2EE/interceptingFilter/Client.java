package com.leo.test.patterns.J2EE.interceptingFilter;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
