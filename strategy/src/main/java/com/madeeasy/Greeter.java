package com.madeeasy;

// Context class
public class Greeter {
    private GreetingStrategy strategy;

    public Greeter(GreetingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(GreetingStrategy strategy) {
        this.strategy = strategy;
    }

    public void greetPerson() {
        // Delegate greeting to the strategy
        strategy.greet();
    }
}

