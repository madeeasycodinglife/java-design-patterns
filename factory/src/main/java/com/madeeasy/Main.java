package com.madeeasy;

import com.madeeasy.factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw();
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}