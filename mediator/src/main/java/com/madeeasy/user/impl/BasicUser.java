package com.madeeasy.user.impl;

import com.madeeasy.ChatRoomMediator;
import com.madeeasy.User;

// Concrete colleague: BasicUser
public class BasicUser extends User {
    public BasicUser(ChatRoomMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " receives: " + message);
    }
}