package com.madeeasy.dao.impl;

import com.madeeasy.dao.UserDAO;
import com.madeeasy.entity.User;

// Concrete Data Access Object: UserDAOImpl
public class UserDAOImpl implements UserDAO {
    // Assume this class implements methods to interact with the database
    // For simplicity, we'll just provide stub methods

    @Override
    public void addUser(User user) {
        System.out.println("Adding user to the database: " + user.getUsername());
    }

    @Override
    public User getUser(int userId) {
        System.out.println("Fetching user from the database with ID: " + userId);
        // Assume fetching user from the database
        return new User(userId, "SampleUser");
    }

    @Override
    public void updateUser(User user) {
        System.out.println("Updating user in the database: " + user.getUsername());
    }

    @Override
    public void deleteUser(int userId) {
        System.out.println("Deleting user from the database with ID: " + userId);
    }
}
