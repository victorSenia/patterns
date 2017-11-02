package com.leo.test.patterns.behavioral.interpreter;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}