package com.madeeasy.impl;

import com.madeeasy.Handler;
import lombok.Data;


public class ConcreteHandler3 implements Handler {

    private Handler successor;

    @Override
    public void handleRequest(int request) {
        if (request >= 30 && request < 40) {
            System.out.println("Handled by ConcreteHandler3: " + request);
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
