package com.madeeasy;

import com.madeeasy.dao.UserDAO;
import com.madeeasy.dao.impl.UserDAOImpl;
import com.madeeasy.entity.User;

// Client code
public class Main {
    public static void main(String[] args) {
        // Create a UserDAO instance
        UserDAO userDAO = new UserDAOImpl();

        // Add a new user
        User newUser = new User(1, "John");
        userDAO.addUser(newUser);

        // Retrieve a user
        User retrievedUser = userDAO.getUser(1);
        System.out.println("Retrieved user: " + retrievedUser.getUsername());

        // Update user's username
        retrievedUser.setUsername("Jane");
        userDAO.updateUser(retrievedUser);

        // Delete user
        userDAO.deleteUser(1);
    }
}