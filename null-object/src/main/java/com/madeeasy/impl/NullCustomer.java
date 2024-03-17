package com.madeeasy.impl;

import com.madeeasy.Customer;

// Concrete implementation: NullCustomer
public class NullCustomer implements Customer {
    @Override
    public void greet() {
        // Do nothing
    }
}
