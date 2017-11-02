package com.leo.test.patterns.behavioral.visitor;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
