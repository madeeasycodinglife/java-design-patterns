package com.madeeasy.animal.impl;

import com.madeeasy.Animal;
import com.madeeasy.AnimalVisitor;

// Concrete element: Dog
public class Dog implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
