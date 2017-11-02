package com.leo.test.patterns.J2EE.interceptingFilter;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
