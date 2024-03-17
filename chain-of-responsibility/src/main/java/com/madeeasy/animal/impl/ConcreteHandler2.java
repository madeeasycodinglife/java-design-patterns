package com.madeeasy.animal.impl;

import com.madeeasy.Handler;
import lombok.Data;

@Data
public class ConcreteHandler2 implements Handler {
    private Handler successor;

    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("Handled by ConcreteHandler2: " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        } else {
            System.out.println("No handler found for: " + request);
        }
    }

    /**
     * Here we are not overriding the setSuccessor method.
     * as here i have used @Data which gives the setter method.
     */
}
