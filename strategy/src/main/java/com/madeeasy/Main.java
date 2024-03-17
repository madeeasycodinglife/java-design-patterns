package com.madeeasy;

import com.madeeasy.animal.impl.CasualGreeting;
import com.madeeasy.animal.impl.FormalGreeting;

// Client code
public class Main {
    public static void main(String[] args) {
        // Create a greeter with FormalGreeting strategy
        Greeter greeter = new Greeter(new FormalGreeting());

        // Greet someone using the current strategy
        greeter.greetPerson();

        // Change the strategy to CasualGreeting
        greeter.setStrategy(new CasualGreeting());

        // Greet someone using the new strategy
        greeter.greetPerson();
    }
}