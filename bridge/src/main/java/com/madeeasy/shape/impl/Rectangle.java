package com.madeeasy.shape.impl;

import com.madeeasy.DrawingAPI;
import com.madeeasy.Shape;

// Refined Abstraction: Rectangle
public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.print("Rectangle with width " + width + " and height " + height + ": ");
        drawingAPI.drawShape();
    }
}