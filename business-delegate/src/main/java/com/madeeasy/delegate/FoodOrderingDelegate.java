package com.madeeasy.delegate;

import com.madeeasy.FoodService;

// Business Delegate
public class FoodOrderingDelegate {
    private FoodService foodService;

    public void setFoodService(FoodService foodService) {
        this.foodService = foodService;
    }

    public void orderFood(String foodItem) {
        foodService.orderFood(foodItem);
    }
}

