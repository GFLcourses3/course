package com.geeksforless.facade;

public class AppFacade {
    private Database database;
    private Logger logger;
    private Authenticator authenticator;

    public AppFacade() {
        this.database = new Database();
        this.logger = new Logger();
        this.authenticator = new Authenticator();
    }

    public void doSomething() {
        database.connect();
        logger.log("Did something.");
        authenticator.authenticate("Test", "Test1234!");
    }
}
