package com.leo.test.patterns.J2EE.businessDelegate;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }
}
