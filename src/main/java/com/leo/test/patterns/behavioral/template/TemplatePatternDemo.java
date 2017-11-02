package com.leo.test.patterns.behavioral.template;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}