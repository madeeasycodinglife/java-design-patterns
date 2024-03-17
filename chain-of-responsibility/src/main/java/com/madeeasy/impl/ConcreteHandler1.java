package com.madeeasy.impl;

import com.madeeasy.Handler;


public class ConcreteHandler1 implements Handler {

    private Handler successor;

    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("Handled by ConcreteHandler1: " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        } else {
            System.out.println("No handler found for: " + request);
        }
    }

    @Override
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
