package com.madeeasy.animal.impl;

import com.madeeasy.Animal;
import com.madeeasy.AnimalVisitor;

public class Cat implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
