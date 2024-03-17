package com.madeeasy;

// Client code
public class Main {
    public static void main(String[] args) {
        // Create a computer using the builder
        Computer computer = new ComputerBuilder()
                .setCpu("Intel Core i7")
                .setRam("16GB DDR4")
                .setStorage("512GB SSD")
                .setGpu("NVIDIA GeForce RTX 3070")
                .build();

        // Display the computer details
        System.out.println(computer);
    }
}