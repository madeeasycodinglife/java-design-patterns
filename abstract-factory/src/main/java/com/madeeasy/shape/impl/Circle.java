package com.madeeasy.shape.impl;

import com.madeeasy.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
