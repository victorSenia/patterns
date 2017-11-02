package com.leo.test.patterns.structural.adapter;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        throw new UnsupportedOperationException();
    }
}
