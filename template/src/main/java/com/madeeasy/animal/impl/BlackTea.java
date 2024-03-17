package com.madeeasy.animal.impl;

import com.madeeasy.TeaRecipe;

// Concrete class implementing the tea recipe
public class BlackTea extends TeaRecipe {
    @Override
    protected void boilWater() {
        System.out.println("Boiling water for black tea.");
    }

    @Override
    protected void steepTeaBag() {
        System.out.println("Steeping black tea bag in water.");
    }

    @Override
    protected void pourInCup() {
        System.out.println("Pouring black tea into cup.");
    }
}
