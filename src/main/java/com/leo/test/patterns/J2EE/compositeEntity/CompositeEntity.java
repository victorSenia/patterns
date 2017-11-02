package com.leo.test.patterns.J2EE.compositeEntity;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public String[] getData() {
        return cgo.getData();
    }
}