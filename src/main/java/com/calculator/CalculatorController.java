package com.calculator;

public class CalculatorController {
    private Calculator_I calculator;
    
    public CalculatorController(Calculator_I calculator) {
        this.calculator = calculator;
    }
    
    public int add(int addend, int augend) {
        return calculator.add(addend, augend);
    }
}