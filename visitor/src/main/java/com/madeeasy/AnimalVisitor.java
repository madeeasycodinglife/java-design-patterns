package com.madeeasy;

import com.madeeasy.animal.impl.Cat;
import com.madeeasy.animal.impl.Dog;

// Visitor interface
public interface AnimalVisitor {
    void visit(Dog dog);

    void visit(Cat cat);
}
