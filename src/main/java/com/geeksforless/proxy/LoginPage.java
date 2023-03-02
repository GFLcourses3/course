package com.geeksforless.proxy;

public class LoginPage extends Page{
    private Page page;
    private String login;
    private String password;

    public LoginPage(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    void logIn() {
        if (login.equals("username") && password.equals("password")) {
            page = new HomePage();
            page.logIn();
        }else {
            System.out.println("Access denied!");
        }
    }
}
