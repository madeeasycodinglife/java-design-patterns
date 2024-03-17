package com.madeeasy.controller;

import com.madeeasy.model.CalculatorModel;
import com.madeeasy.view.CalculatorView;

// Controller
public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void performOperation(String operation, int num1, int num2) {
        int result;
        switch (operation) {
            case "add":
                model.setNumbers(num1, num2);
                result = model.add();
                break;
            case "subtract":
                model.setNumbers(num1, num2);
                result = model.subtract();
                break;
            case "multiply":
                model.setNumbers(num1, num2);
                result = model.multiply();
                break;
            case "divide":
                model.setNumbers(num1, num2);
                result = model.divide();
                break;
            default:
                result = 0;
                break;
        }
        view.displayResult(operation, result);
    }
}
