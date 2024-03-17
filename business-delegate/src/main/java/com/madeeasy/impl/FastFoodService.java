package com.madeeasy.impl;

import com.madeeasy.FoodService;

// Concrete Business Service: FastFoodService
public class FastFoodService implements FoodService {
    @Override
    public void orderFood(String foodItem) {
        System.out.println("Ordering " + foodItem + " from the fast food service.");
    }
}