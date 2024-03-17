package com.madeeasy.impl;

import com.madeeasy.Customer;

// Concrete implementation: RealCustomer
public class RealCustomer implements Customer {
    private String name;

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public void greet() {
        System.out.println("Hello, " + name + "!");
    }
}
