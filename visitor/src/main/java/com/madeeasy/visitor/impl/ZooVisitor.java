package com.madeeasy.visitor.impl;

import com.madeeasy.AnimalVisitor;
import com.madeeasy.animal.impl.Cat;
import com.madeeasy.animal.impl.Dog;

// Concrete visitor: ZooVisitor
public class ZooVisitor implements AnimalVisitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("Dog is being visited in the zoo.");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Cat is being visited in the zoo.");
    }
}
