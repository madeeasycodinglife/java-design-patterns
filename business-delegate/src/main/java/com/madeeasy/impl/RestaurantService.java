package com.madeeasy.impl;

import com.madeeasy.FoodService;

// Concrete Business Service: RestaurantService
public class RestaurantService implements FoodService {
    @Override
    public void orderFood(String foodItem) {
        System.out.println("Ordering " + foodItem + " from the restaurant service.");
    }
}
