package com.leo.test.patterns.J2EE.businessDelegate;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}