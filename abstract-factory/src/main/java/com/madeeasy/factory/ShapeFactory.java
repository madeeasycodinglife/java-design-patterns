package com.madeeasy.factory;

import com.madeeasy.Color;
import com.madeeasy.Shape;
import com.madeeasy.abstractfactory.AbstractFactory;
import com.madeeasy.shape.impl.Circle;
import com.madeeasy.shape.impl.Rectangle;
import com.madeeasy.shape.impl.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
