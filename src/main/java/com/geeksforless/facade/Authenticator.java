package com.geeksforless.facade;

public class Authenticator {
    public boolean authenticate(String username, String password) {
        System.out.printf("Trying to log in with username: %s and password: %s \n", username, password);
        return true;
    }
}
