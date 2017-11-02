package com.leo.test.patterns.J2EE.compositeEntity;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for (String s : compositeEntity.getData())
            System.out.println("Data: " + s);
    }

    public void setData(String data1, String data2) {
        compositeEntity.setData(data1, data2);
    }
}
