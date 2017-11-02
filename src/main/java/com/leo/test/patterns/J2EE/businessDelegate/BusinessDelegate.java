package com.leo.test.patterns.J2EE.businessDelegate;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();

    private BusinessService businessService;

    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
