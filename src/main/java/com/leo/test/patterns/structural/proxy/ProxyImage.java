package com.leo.test.patterns.structural.proxy;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class ProxyImage implements Image {
    private RealImage realImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
