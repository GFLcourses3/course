package com.geeksforless.proxy;

public class Main {
    public static void main(String[] args) {
        Page loginPage = new LoginPage("username", "password");
        loginPage.logIn();
    }
}
