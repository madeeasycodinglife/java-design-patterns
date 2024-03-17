package com.madeeasy;

import com.madeeasy.animal.impl.Cat;
import com.madeeasy.animal.impl.Dog;
import com.madeeasy.visitor.impl.ZooVisitor;

// Client code
public class Main {
    public static void main(String[] args) {
        // Create animals
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Create visitor
        AnimalVisitor zooVisitor = new ZooVisitor();

        // Visit animals
        dog.accept(zooVisitor);
        cat.accept(zooVisitor);
    }
}