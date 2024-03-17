package com.madeeasy;

import com.madeeasy.delegate.FoodOrderingDelegate;
import com.madeeasy.impl.FastFoodService;
import com.madeeasy.impl.RestaurantService;

// Client code
public class Main {
    public static void main(String[] args) {
        // Create FoodOrderingDelegate
        FoodOrderingDelegate delegate = new FoodOrderingDelegate();

        // Set the service type for the delegate
        delegate.setFoodService(new FastFoodService());

        // Order food using the delegate
        delegate.orderFood("Burger");

        // Change the service type for the delegate
        delegate.setFoodService(new RestaurantService());

        // Order food using the delegate with the new service type
        delegate.orderFood("Steak");
    }
}