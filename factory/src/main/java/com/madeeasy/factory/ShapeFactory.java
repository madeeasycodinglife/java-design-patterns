package com.madeeasy.factory;

import com.madeeasy.Shape;
import com.madeeasy.shape.impl.Circle;
import com.madeeasy.shape.impl.Rectangle;
import com.madeeasy.shape.impl.Square;

// this class is required to create object of type shape
public class ShapeFactory {

    //use getShape method to get object of type shape
    public static Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else {
            return null;
        }

    }
}
