package com.madeeasy.dao;

import com.madeeasy.entity.User;

// Data Access Object interface
public interface UserDAO {
    void addUser(User user);
    User getUser(int userId);
    void updateUser(User user);
    void deleteUser(int userId);
}

