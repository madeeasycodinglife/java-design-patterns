package com.madeeasy;

import com.madeeasy.impl.BlackTea;
import com.madeeasy.impl.GreenTea;

// Client code
public class Main {
    public static void main(String[] args) {
        System.out.println("Making black tea:");
        TeaRecipe blackTea = new BlackTea();
        blackTea.makeTea();

        System.out.println("\nMaking green tea:");
        TeaRecipe greenTea = new GreenTea();
        greenTea.makeTea();
    }
}