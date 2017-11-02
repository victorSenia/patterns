package com.leo.test.patterns.J2EE.compositeEntity;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class CoarseGrainedObject {
    private DependentObject2 do2 = new DependentObject2();

    private DependentObject1 do1 = new DependentObject1();

    public void setData(String data1, String data2) {
        do1.setData(data1);
        do2.setData(data2);
    }

    public String[] getData() {
        return new String[]{do1.getData(), do2.getData()};
    }
}
