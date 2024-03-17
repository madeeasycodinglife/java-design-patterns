package com.madeeasy.user.impl;

import com.madeeasy.ChatRoomMediator;
import com.madeeasy.User;

// Concrete colleague: AdminUser
public class AdminUser extends User {
    public AdminUser(ChatRoomMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("[Admin] " + name + " receives: " + message);
    }
}
