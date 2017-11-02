package com.leo.test.patterns.behavioral.chainOfResponsibility;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
