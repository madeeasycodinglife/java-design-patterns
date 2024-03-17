package com.madeeasy;

// Client code
public class Main {
    public static void main(String[] args) {
        // Create Front Controller
        FrontController frontController = new FrontController();

        // Handle requests
        frontController.handleRequest("home");
        frontController.handleRequest("about");
        frontController.handleRequest("contact"); // Invalid request
    }
}