package com.madeeasy;

public class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;
    private static int instanceCount = 0; // Track the number of instances created

    // Private constructor to prevent instantiation
    private Singleton() {
        // Optional: Initialization code
        instanceCount++; // Increment the instance count each time a new instance is created
    }

    // Public static method to provide access to the single instance
    public static Singleton getInstance() {

        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
                System.out.println("Number of instances created: " + instanceCount);
            }
        }

        return instance;
    }
}
