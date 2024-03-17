package com.madeeasy.chatroom.impl;

import com.madeeasy.ChatRoomMediator;
import com.madeeasy.User;

import java.util.ArrayList;
import java.util.List;

// Concrete mediator: ChatRoom
public class ChatRoom implements ChatRoomMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(User sender, String message) {
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }
}