package com.leo.test.patterns.behavioral.visitor;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
