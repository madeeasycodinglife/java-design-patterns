package com.madeeasy;

// Client code
public class Main {
    public static void main(String[] args) {
        // Create a composite entity: UserProfile
        UserProfile userProfile = new UserProfile();

        // Set profile settings
        userProfile.setProfile("John Doe", "john@example.com", "password123");

        // Display profile settings
        System.out.println("Name: " + userProfile.getName());
        System.out.println("Email: " + userProfile.getEmail());
        System.out.println("Password: " + userProfile.getPassword());
    }
}