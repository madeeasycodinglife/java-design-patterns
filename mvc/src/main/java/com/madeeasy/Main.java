package com.madeeasy;

import com.madeeasy.controller.CalculatorController;
import com.madeeasy.model.CalculatorModel;
import com.madeeasy.view.CalculatorView;

// Client code
public class Main {
    public static void main(String[] args) {
        // Create model, view, and controller
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        // Perform operations
        controller.performOperation("add", 5, 3);
        controller.performOperation("subtract", 8, 2);
        controller.performOperation("multiply", 4, 6);
        controller.performOperation("divide", 10, 2);
    }

}