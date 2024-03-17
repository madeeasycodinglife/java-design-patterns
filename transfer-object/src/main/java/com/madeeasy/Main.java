package com.madeeasy;

// Client code
public class Main {
    public static void main(String[] args) {
        // Create transfer object
        UserTO userTO = new UserTO("John", "john@example.com");

        // Create service class instance
        UserService userService = new UserService();

        // Save user using transfer object
        userService.saveUser(userTO);
    }
}