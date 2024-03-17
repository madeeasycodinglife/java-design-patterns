package com.madeeasy;

import com.madeeasy.factory.CustomerFactory;

// Client code
public class Main {
    public static void main(String[] args) {
        // Get customer objects
        Customer customer1 = CustomerFactory.getCustomer("Alice");
        Customer customer2 = CustomerFactory.getCustomer("John");

        // Greet customers
        customer1.greet(); // Output: Hello, Alice!
        customer2.greet(); // (No output because John is not found in the database)
    }
}