package com.madeeasy.impl;

import com.madeeasy.TeaRecipe;

// Concrete class implementing the tea recipe
public class GreenTea extends TeaRecipe {
    @Override
    protected void boilWater() {
        System.out.println("Boiling water for green tea.");
    }

    @Override
    protected void steepTeaBag() {
        System.out.println("Steeping green tea bag in water.");
    }

    @Override
    protected void pourInCup() {
        System.out.println("Pouring green tea into cup.");
    }

    // Override hook method to customize behavior (optional step)
    @Override
    protected void addLemon() {
        System.out.println("Adding lemon and honey to green tea.");
    }
}
