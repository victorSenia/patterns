package com.leo.test.patterns.behavioral.template;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //template method
    public final void play() {

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
