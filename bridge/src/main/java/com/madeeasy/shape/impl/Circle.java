package com.madeeasy.shape.impl;

import com.madeeasy.DrawingAPI;
import com.madeeasy.Shape;

// Refined Abstraction: Circle
public class Circle extends Shape {
    private int radius;

    public Circle(int radius, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.print("Circle with radius " + radius + ": ");
        drawingAPI.drawShape();
    }
}