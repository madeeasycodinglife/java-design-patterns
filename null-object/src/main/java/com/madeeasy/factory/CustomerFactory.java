package com.madeeasy.factory;

import com.madeeasy.Customer;
import com.madeeasy.animal.impl.NullCustomer;
import com.madeeasy.animal.impl.RealCustomer;

// Factory class to get customer object
public class CustomerFactory {
    public static final String[] names = {"Alice", "Bob", "Charlie"};

    public static Customer getCustomer(String name) {
        for (String customerName : names) {
            if (customerName.equals(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}