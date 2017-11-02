package com.leo.test.patterns.behavioral.chainOfResponsibility;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
