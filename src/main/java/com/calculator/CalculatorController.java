package com.calculator;

public class CalculatorController {
    private Calculator calculator;
    
    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }
    
    public int add(int addend, int augend) {
        return calculator.add(addend, augend);
    }
}