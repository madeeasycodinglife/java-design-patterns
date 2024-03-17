package com.madeeasy;

// Service class
public class UserService {
    // Simulate database storing users
    public void saveUser(UserTO userTO) {
        // Logic to save user data to database
        System.out.println("User saved: " + userTO.getUsername() + ", " + userTO.getEmail());
    }
}
