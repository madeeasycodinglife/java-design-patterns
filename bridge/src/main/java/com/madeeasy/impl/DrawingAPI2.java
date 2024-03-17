package com.madeeasy.impl;

import com.madeeasy.DrawingAPI;

// Concrete Implementor: DrawingAPI2
public class DrawingAPI2 implements DrawingAPI {
    @Override
    public void drawShape() {
        System.out.println("Drawing shape using DrawingAPI2");
    }
}
