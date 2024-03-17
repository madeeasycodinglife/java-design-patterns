package com.madeeasy.animal.impl;

import com.madeeasy.GreetingStrategy;

// Concrete strategy: CasualGreeting
public class CasualGreeting implements GreetingStrategy {
    @Override
    public void greet() {
        System.out.println("Hey there! How's it going?");
    }
}
