package com.leo.test.patterns.J2EE.businessDelegate;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}