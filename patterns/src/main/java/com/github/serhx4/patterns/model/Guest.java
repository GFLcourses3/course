package com.github.serhx4.patterns.model;

public class Guest extends User {
    public Guest() {
        super("guest", "", Role.GUEST);
    }
}
