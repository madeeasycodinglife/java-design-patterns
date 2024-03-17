package com.madeeasy;

import com.madeeasy.chatroom.impl.ChatRoom;
import com.madeeasy.user.impl.AdminUser;
import com.madeeasy.user.impl.BasicUser;

// Client code
public class Main {
    public static void main(String[] args) {
        // Create mediator
        ChatRoomMediator chatRoom = new ChatRoom();

        // Create users
        User alice = new BasicUser(chatRoom, "Alice");
        User bob = new BasicUser(chatRoom, "Bob");
        User charlie = new AdminUser(chatRoom, "Charlie"); // Charlie is an admin user

        // Add users to the chat room
        ((ChatRoom) chatRoom).addUser(alice);
        ((ChatRoom) chatRoom).addUser(bob);
        ((ChatRoom) chatRoom).addUser(charlie);

        // Send messages
        alice.send("Hello, everyone!");
        bob.send("Hi, Alice!");
        charlie.send("Hey, guys!");
    }
}