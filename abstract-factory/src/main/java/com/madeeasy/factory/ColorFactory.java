package com.madeeasy.factory;

import com.madeeasy.Color;
import com.madeeasy.Shape;
import com.madeeasy.abstractfactory.AbstractFactory;
import com.madeeasy.color.impl.Blue;
import com.madeeasy.color.impl.Green;
import com.madeeasy.color.impl.Red;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
