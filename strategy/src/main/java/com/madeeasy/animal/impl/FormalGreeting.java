package com.madeeasy.animal.impl;

import com.madeeasy.GreetingStrategy;

// Concrete strategy: FormalGreeting
public class FormalGreeting implements GreetingStrategy {
    @Override
    public void greet() {
        System.out.println("Good morning! Have a nice day.");
    }
}

