package com.madeeasy.impl;

import com.madeeasy.DrawingAPI;

// Concrete Implementor: DrawingAPI1
public class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawShape() {
        System.out.println("Drawing shape using DrawingAPI1");
    }
}
