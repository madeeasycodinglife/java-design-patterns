package com.madeeasy.shape.impl;

import com.madeeasy.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
