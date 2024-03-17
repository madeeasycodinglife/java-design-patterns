package com.madeeasy;

import com.madeeasy.impl.DrawingAPI1;
import com.madeeasy.impl.DrawingAPI2;
import com.madeeasy.shape.impl.Circle;
import com.madeeasy.shape.impl.Rectangle;

// Client code
public class Main {
    public static void main(String[] args) {
        // Create shapes with different drawing APIs
        Shape circle = new Circle(5, new DrawingAPI1());
        Shape rectangle = new Rectangle(10, 7, new DrawingAPI2());

        // Draw shapes
        circle.draw(); // Circle with radius 5: Drawing shape using DrawingAPI1
        rectangle.draw(); // Rectangle with width 10 and height 7: Drawing shape using DrawingAPI2
    }
}