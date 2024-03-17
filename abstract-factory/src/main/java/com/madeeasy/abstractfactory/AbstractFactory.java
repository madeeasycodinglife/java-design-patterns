package com.madeeasy.abstractfactory;

import com.madeeasy.Color;
import com.madeeasy.Shape;

public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}
