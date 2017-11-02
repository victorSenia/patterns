package com.leo.test.patterns.behavioral.visitor;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}