package com.madeeasy;

// Abstract class defining the template method
public abstract class TeaRecipe {
    // Template method - defines the steps to make tea
    public final void makeTea() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon(); // This step is optional and can be overridden by subclasses
        System.out.println("Tea is ready!");
    }

    // Steps of the tea-making process (methods to be implemented by subclasses)
    protected abstract void boilWater();
    protected abstract void steepTeaBag();
    protected abstract void pourInCup();

    // Optional hook method (can be overridden by subclasses)
    protected void addLemon() {
        System.out.println("Adding lemon to tea.");
    }
}
