package com.leo.test.patterns.behavioral.mediator;

import java.util.Date;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}