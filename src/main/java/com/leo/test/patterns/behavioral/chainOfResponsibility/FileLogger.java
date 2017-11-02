package com.leo.test.patterns.behavioral.chainOfResponsibility;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
